# Composite Pattern

-> Nesneleri ağaç halinde oluşturmamıza ve bu ağacın dalları tek tek 
nesnelermiş gibi çalışmamıza olanak sağlayan yapıdır.
D = Developer


                   CEO  (Composite / Dal)
                    |   
                    |
                Director  (Composite / Dal)
                    |
                    |
                 Manager  (Composite / Dal)
                    |
           _________|_________
          |         |         |
     Team Leader  Team L.2  Team L.3  (Composite / Dal)
          |
     _____|_____
    |     |     |
    D1    D2    D3  (Leaf / Yaprak / Junior)

-> Bazen nesneler arasında bir "Ağaç Hiyerarşisi" (Tree Structure) kurmamız gerekir. Bilgisayarındaki klasör sistemini düşün: Bir klasörün içinde dosyalar olabilir, ama aynı zamanda başka klasörler de olabilir.
Bir CEO'nun altında müdürler vardır, müdürlerin altında takım liderleri, onların altında da yazılımcılar vardır.

Sorun: CEO'ya "Bütün şirketinin maaşını hesapla" dediğinde CEO, müdürleri mi dönecek, yazılımcıları mı?

Çözüm (Composite): Hepsine ortak bir kimlik (Interface/Abstract Class) ver! Dal (Composite) ile Yaprağı (Leaf) birbirinden ayırmadan, sanki hepsi aynı nesneymiş gibi davran.

- Component (Temel Yapı): Developer sınıfı. Herkesin ortak atası.
- Composite (Dal): SoftwareDeveloper sınıfı. Altında başka yazılımcılar barındırabilen kişiler (Manager, Senior vb.).
- Leaf (Yaprak): Junior sınıfı. Hiyerarşinin en altı. Altında kimse olamaz.

Harika, şimdi biraz daha yapısal (structural) bir desene geçiyoruz. **Composite Pattern (Bileşik/Kompozit Tasarım Deseni)**.

Bu deseni anlamanın en güzel yolu bilgisayarındaki **Dosya ve Klasör** sistemini düşünmektir.

### 1. Mantık Nedir? Neden İhtiyaç Duyarız?

**Gerçek Hayat Senaryosu:**
Masaüstünde bir Klasör var (Ana Klasör). İçinde bir resim Dosyası var. Ama aynı zamanda içinde başka bir Klasör (Tatil Fotoları) daha var. Onun içinde de dosyalar ve belki yine klasörler var...

Sen "Ana Klasör"e sağ tıklayıp "Özellikler" dediğinde bilgisayar sana toplam boyutu hesaplar. Bilgisayar bunu yaparken arka planda nasıl çalışır?

**"Düz" Yapsaydık (Amele Yöntemi) Ne Olurdu?**
Eğer Composite kullanmasaydık kodumuz şuna benzerdi:
```java
// İç içe geçmiş şeyleri okumak için if-else kabusu
if (oge instanceof Dosya) {
    boyut += oge.getBoyut();
} else if (oge instanceof Klasor) {
    for (Oge altOge : oge.icindekiler) {
         if (altOge instanceof Dosya) { ... }
         else if (altOge instanceof Klasor) { ... } // Gittiği yere kadar böyle yazmak zorundasın!
    }
}
```
İç içe 10 tane klasör varsa ne yapacaksın? Sonsuz bir if-else döngüsüne girersin.

**Çözüm (Composite Pattern Felsefesi):**
Tekil bir nesne (Dosya) ile, bu nesnelerin toplamından oluşan grubu (Klasör) **SANKİ İKİSİ DE AYNI ŞEYMİŞ GİBİ** yönetebilmek. Patron (Main metodu) "Bana detayları/boyutu ver" dediğinde karşısındakinin tek bir dosya mı yoksa içi dolu devasa bir klasör mü olduğunu umursamaz. İkisine de aynı metodu çağırır.

---

### 2. Kodla Anlatım

Bu desende 3 aktör vardır:
1. **Component (Ortak Arayüz):** Hem Dosya hem Klasör bu arayüzü kullanır.
2. **Leaf (Yaprak):** Altı boş olan, en uçtaki tekil nesnedir (Dosya).
3. **Composite (Kapsayıcı):** İçinde başka nesneler (Dosya veya başka Klasör) tutabilen nesnedir (Klasör).

```java
import java.util.ArrayList;
import java.util.List;

// 1. COMPONENT (Ortak Arayüz)
// İster dosya olsun ister klasör, herkes bu kurala uyacak.
public interface FileSystemItem {
    void showDetails(); // Detayları göster metodu
}

// 2. LEAF (Yaprak Sınıf - Tekil Öğe)
// Altında başka bir şey tutamaz. Ağacın en ucudur. (Dosya)
public class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("   - Dosya: " + name);
    }
}

// 3. COMPOSITE (Kapsayıcı Sınıf - Grup Öğesi)
// İçinde listeler halinde başka FileSystemItem'lar tutar (Dosya da olabilir Klasör de)
public class Folder implements FileSystemItem {
    private String name;
    // İŞTE BÜYÜ BURADA: Kendisiyle aynı arayüzü uygulayan nesneleri listede tutuyor.
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void showDetails() {
        System.out.println("+ Klasör: " + name);
        // Kendi içindeki HER ŞEYİN (dosya veya klasör fark etmez) showDetails metodunu çağırıyor.
        for (FileSystemItem item : items) {
            item.showDetails();
        }
    }
}
```

**Kullanım (Main Sınıfı):**
```java
public class Main {
    public static void main(String[] args) {
        // 1. Tekil Dosyaları (Yaprakları) oluşturalım
        File f1 = new File("vesikalik.jpg");
        File f2 = new File("tarkan_sikidim.mp3");
        File f3 = new File("rapor.pdf");

        // 2. Klasörleri oluşturalım
        Folder resimlerKlasoru = new Folder("Resimlerim");
        Folder muziklerKlasoru = new Folder("Müziklerim");
        Folder anaKlasor = new Folder("C_Surucusu");

        // 3. Hiyerarşiyi (Ağaç Yapısını) kuralım
        resimlerKlasoru.add(f1); // Klasöre dosya ekledik
        muziklerKlasoru.add(f2); // Klasöre dosya ekledik

        anaKlasor.add(resimlerKlasoru); // DİKKAT: Klasöre KLASÖR ekledik!
        anaKlasor.add(muziklerKlasoru); // Klasöre KLASÖR ekledik!
        anaKlasor.add(f3);              // Klasöre doğrudan DOSYA ekledik!

        // 4. Bütün Sistemi Çalıştıralım
        // Müşteri (Client) sadece anaKlasor'e "göster" der. İçerideki cehennemden haberi yoktur.
        anaKlasor.showDetails(); 
    }
}
```

---

### 3. Debug Mantığı: Kod Adım Adım Nasıl Çalışıyor?

Şimdi `anaKlasor.showDetails();` dediğimizde arka planda işlerin nasıl otomatiğe bağlandığını (Recursive - Öz Yinelemeli akış) izleyelim:

**ADIM 1: `anaKlasor.showDetails();`**
*   **Ne oluyor:** `C_Surucusu` klasörünün `showDetails()` metodu tetikleniyor. Ekrana `+ Klasör: C_Surucusu` yazdırıyor.
*   **Döngü Başlıyor:** Ana klasör, kendi içindeki listeyi (items) dönmeye başlıyor. Listede 3 şey var: `resimlerKlasoru`, `muziklerKlasoru` ve `f3(rapor)`.

**ADIM 2: Listedeki İlk Eleman (`resimlerKlasoru`)**
*   **Ne oluyor:** Ana klasör, sıradaki elemanın `showDetails()` metodunu çağırıyor.
*   Peki sıradaki eleman ne? Bir Klasör! O zaman akış `Folder` sınıfının içine tekrar giriyor.
*   Ekrana `+ Klasör: Resimlerim` yazdırıyor.
*   Sonra **Resimler klasörü kendi döngüsüne başlıyor.** İçindeki `vesikalik.jpg` dosyasının `showDetails()` metodunu çağırıyor. Ekrana `   - Dosya: vesikalik.jpg` yazılıyor. (Resimler klasörünün işi bitti, ana döngüye geri dönüyoruz).

**ADIM 3: Listedeki İkinci Eleman (`muziklerKlasoru`)**
*   **Ne oluyor:** Ana klasör döngüsündeki ikinci elemana geçer. Bu da bir Klasör. Aynı olaylar tekrar eder. Ekrana `+ Klasör: Müziklerim` yazar, sonra kendi içine girip `   - Dosya: tarkan_sikidim.mp3` yazar. Geri döner.

**ADIM 4: Listedeki Üçüncü Eleman (`f3 - rapor.pdf`)**
*   **Ne oluyor:** Ana klasör üçüncü elemana gelir. Bunun `showDetails()` metodunu çağırır.
*   **Kritik Nokta:** Bu kez gidilen yer `Folder` değil, bir `File` (Yaprak) sınıfıdır. O yüzden döngüye falan girmez. Sadece `   - Dosya: rapor.pdf` yazar ve işi biter.

**EKRAN ÇIKTISI ŞU OLUR:**
```text
+ Klasör: C_Surucusu
+ Klasör: Resimlerim
   - Dosya: vesikalik.jpg
+ Klasör: Müziklerim
   - Dosya: tarkan_sikidim.mp3
   - Dosya: rapor.pdf
```

---

### Özetle Ne Kazandık? Neyi Çözdük?

Eğer bu deseni kurmasaydın, Main metodundaki ana klasörün içindekileri ekrana yazdırmak için senin manuel olarak: *"Acaba sıradaki eleman dosya mı? Dosyaysa adını yazdır, klasörse listesini al, içindeki listeyi dön..."* diye amele gibi kodu senin yönetmen gerekecekti. İç içe 50 klasör olsaydı sistemin çökecekti (veya çok karışık bir recursive metot yazman gerekecekti).

**Composite sayesinde;**
Müşteri (Main metodu) sadece elindeki nesnenin arayüzünü (`FileSystemItem`) bilir. `showDetails()` der geçer.
Nesne eğer bir dosya ise kendi adını yazıp susar.
Eğer bir klasörse, zincirleme bir reaksiyonla (domino taşı gibi) altındaki tüm klasör ve dosyaları otomatik tetikler.

Senaryolar:
* UI tasarımlarında kullanılır (Bir Panel'in içine Buton da ekleyebilirsin, başka bir Panel de ekleyebilirsin).
* Sepet hesaplamalarında kullanılır (Sepette tekil Ürün de olabilir, içi dolu bir Kampanya Paketi de olabilir. İkisine de `FiyatNedir()` dersin, Paket kendi içindeki ürünleri toplayıp döner, Ürün kendi fiyatını döner).