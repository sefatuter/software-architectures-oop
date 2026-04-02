# Builder Pattern

-> Karmaşık nesneleri adım adım oluşturmamıza olanak tanıyan creational bir tasarım modelidir.
Bu tasarım aynı yapı kodunu kullanarak bir nesnenin farklı türlerini üretmemize olanak tanır.

Örneğin, house nesnesi oluşturacağımızı düşünelim. Basit bir ev inşa etmek için 4 duvar ve zemin inşa etmeniz gerekir.
Farklı özellikler eklenmek istendiğinde bu tasarım devreye girer.

Bu hissiyata kapılmakta **%100 haklısın**. Kodlamaya yeni başlanıldığında veya sınıfın sadece 3-5 tane özelliği (field) olduğunda, Builder Pattern gerçekten de "araya fazladan, gereksiz bir sınıf yazmak" gibi hissettirir.

Ancak bu pattern'in asıl gücü, sınıflar büyümeye başladığında ve "Güvenli (Thread-safe)" kod yazmak istediğimizde ortaya çıkar.

Sana neden "düz set etmek" (Setter kullanmak) yerine bu zahmete girdiğimizi, arkasındaki felsefeyi ve kodun nasıl aktığını **debug (adım adım çalışma)** mantığıyla, en anlaşılır haliyle anlatayım.

---

### 1. Neden "Düz Set Etmek" (Setter) Yerine Builder Kullanıyoruz?

Düz set etmek dediğin yapı şudur (JavaBeans mantığı):
```java
Person p = new Person(); 
p.setName("Ahmet");
p.setSurname("Yılmaz");
p.setAge(25);
```
**Bunun 2 büyük problemi vardır:**

**Problem 1: Tutarsız Durum (Inconsistent State)**
Sen `new Person()` dediğin an hafızada bir `Person` oluşur. Ama içi boştur (name=null, age=0). Sen `p.setName("Ahmet")` satırını çalıştırdıktan hemen sonra, tam `setSurname` yapacakken sistemde bir hata olursa veya başka bir thread (iş parçacığı) bu nesneyi okumaya çalışırsa ne olur? Karşısına soyadı olmayan, yarım yamalak, "sakat" doğmuş bir `Person` nesnesi çıkar.
*Builder Pattern'de nesne "Yarım" doğmaz. `build()` metodunu çağırana kadar ortada bir `Person` yoktur. Sadece bir "taslak" (Builder) vardır.*

**Problem 2: Değişmezlik (Immutability)**
Setter'lar açık olduğu sürece, programın ilerleyen bir yerinde başka bir yazılımcı (veya sen yanlışlıkla) `p.setAge(999)` diyerek nesnenin verisini bozabilir.
*Senin yazdığın kodda dikkat edersen `Person` sınıfının **Setter'ları yok!** Sadece Private Constructor'ı var. Yani Builder ile nesne bir kere üretilir, ondan sonra kimse o nesnenin adını, yaşını değiştiremez. Buna **Immutable (Değişmez)** nesne denir ve hatasız kod yazmanın altın kuralıdır.*

---

### 2. Constructor (Yapıcı Metot) Kullansak Olmaz mıydı?

Şöyle bir constructor yazabilirdik:
`public Person(String name, String surname, String phone, String address, int age)`

Kullanırken şöyle olurdu:
`Person p = new Person("Ahmet", "Yılmaz", null, null, 25);`

**Problem:** Hangi `null` telefondu, hangisi adresti? Yaş parametresi 4. müydü 5. miydi? Parametre sayısı 10'a çıkarsa bu kodu okumak ve yazmak işkence olur. (Buna *Telescoping Constructor Anti-Pattern* denir).

**Builder'ın Çözümü:**
`Person p = new Person.Builder().setName("Ahmet").setAge(25).build();`
Ne kadar okunaklı değil mi? Telefon veya adres vermek istemiyorsam onları hiç yazmıyorum (null geçmek zorunda kalmıyorum). Ne set ettiğim kabak gibi ortada.

---

### 3. Debug Mantığı: Kod Adım Adım Nasıl Çalışıyor?

Şimdi şu kodu çalıştırdığımızı düşünelim ve arka planda ne oluyor adım adım izleyelim:

```java
Person p = new Person.Builder()
             .setName("Ahmet")
             .setSurname("Yılmaz")
             .build();
```

**ADIM 1: `new Person.Builder()`**
*   **Ne oluyor:** `Person` sınıfından bağımsız olarak, içerdeki statik `Builder` sınıfından bir nesne üretiliyor.
*   **Hafıza (RAM):** Ortada hala bir `Person` nesnesi **YOK**. Sadece adı, soyadı, yaşı boş olan bir "Kalıp/Taslak" nesnesi (Builder) var.

**ADIM 2: `.setName("Ahmet")`**
*   **Ne oluyor:** Ürettiğimiz taslak nesnenin içindeki `setName` metodu çalışıyor. Taslağın `name` alanına "Ahmet" yazılıyor.
*   **Kritik Nokta (`return this;`):** Senin kodundaki `return this;` kısmı çok önemlidir. Metot işini bitirince **Builder nesnesinin kendisini geri döndürür.** Bu sayede arkasına hemen nokta koyup `.setSurname()` yazmaya devam edebiliriz. Buna *Method Chaining (Metot Zincirleme)* veya *Fluent API* denir.

**ADIM 3: `.setSurname("Yılmaz")`**
*   **Ne oluyor:** Taslağın soyadı kısmı da dolduruluyor. Yine `this` (taslağın kendisi) dönüyor.
*   **Durum:** Taslağımız (Builder) hazır. Adı Ahmet, soyadı Yılmaz.

**ADIM 4: `.build()` (BAM! SİHRİN GERÇEKLEŞTİĞİ YER)**
*   **Ne oluyor:** Builder'ın içindeki `build()` metodu çağrılıyor.
*   **Kodun İçi:** `return new Person(this);`
*   Burada nihayet **gerçek `Person` nesnesi** hafızada yaratılıyor (`new Person`). Üstelik bu yaratılma işlemi `Person` sınıfının *Private Constructor*'ına gönderiliyor.
*   O private constructor, parametre olarak içi dolu olan Taslağı (Builder'ı - `this`) alıyor.
*   Taslaktaki verileri (Ahmet, Yılmaz) alıp, kendi içine (Person'ın field'larına) kopyalıyor.
*   Ve bize **tamamlanmış, dört dörtlük, bir daha asla değiştirilemeyecek (setter'ı olmayan)** bir `Person` nesnesi teslim ediyor.

---

### Özetle Ne Kazandık? Araya O "Builder"ı Koyarak Neyi Çözdük?

1.  **Okunabilirlik:** Ne set ettiğimizi isim isim (`setName`, `setAge`) görerek nesne ürettik. 15 parametreli karmakarışık constructor'lardan kurtulduk.
2.  **Seçimsellik:** Sadece ihtiyacımız olan alanları set ettik. Adres ve telefon vermek istemedik ve null yazmak zorunda kalmadık.
3.  **Güvenlik (Immutability):** Nesne bir kez `build()` edildikten sonra setter'ı olmadığı için kimse içeriğini bozamaz.
4.  **Bütünlük:** Nesne `build()` edilene kadar ortada bir `Person` yoktur. Yani programın hiçbir yerinde "adı girilmiş ama henüz yaşı girilmemiş yarım bir Person" nesnesi dolaşamaz.

*(Not: Gönderdiğin kodda `Person` ve `Builder` içine `phone` ve `address` yazılmış ama eşleştirmeleri unutulmuş. Onları da eklediğinde kalıp tam oturacaktır. Builder pattern profesyonel Java projelerinde, özellikle Spring Boot gibi frameworklerde (Lombok kütüphanesi `@Builder` anotasyonu ile bu yazdığın kodu otomatik üretir) en çok kullanılan yapıdır.)*