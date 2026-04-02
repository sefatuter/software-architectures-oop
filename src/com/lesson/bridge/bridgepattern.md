## Bridge Design Pattern

-> Büyük bir sınıfı veya yakından ilişkili sınıflar kümesini birbirinden
bağımsız olarak geliştirebilen iki ayrı hiyerarşiye (abstraction ve implementasyon)
ayırmanıza olanak sağlayan structural bir tasarım modelidir.

// şema defterde

-> Bu bölüme yeni şekil türleri ve renkler eklemek istersek üstteki şekil katlanarak büyüyecektir.

//şemadaki kırmızı renkler

Çözüm: 

-> Bu sorun şekil sınıflarını 2 farklı boyutta genişletmeye çalıştığımız için ortaya çıkıyor.

-> Bridge pattern boyutlardan birini (şekil veya renk) ayrı sınıf hiyerarşisine çıkarmayı önerir.

//şema 2

-> renk ve şekli ayır birbirinin içine geçsin.

Harika ilerliyoruz. Sırada yapısal desenlerin en "neden böyle bir şeye gerek var ki?" dedirten ama anlaşıldığında ufku iki katına çıkaran deseni var: **Bridge Pattern (Köprü Tasarım Deseni)**.

Bu desenin en temel amacı, **"Sınıf Patlaması" (Class Explosion)** dediğimiz o korkunç kabusu engellemektir.

### 1. Mantık Nedir? Neden İhtiyaç Duyarız?

**Gerçek Hayat Senaryosu:**
Bir elektronik firmasında yazılımcısın. Senden **Cihazlar** (TV, Radyo) ve bunları yönetecek **Kumandalar** yapman istendi.

**"Düz" (Kalıtım - Inheritance) Yapsaydık Ne Olurdu?**
Aklımıza ilk gelen yöntem şudur: Bir `Kumanda` ana sınıfı yaparım, diğerlerini ondan türetirim (extends).
1. `TvKumandasi`
2. `RadyoKumandasi`
   *(Şu an 2 sınıfımız var. Her şey yolunda.)*

Patron geldi dedi ki: *"Artık cihazlara Mute (Sessiz) tuşu olan **Akıllı Kumanda** da üreteceğiz."*
Hadi bakalım, şimdi yeni sınıflar yazman lazım:
3. `AkilliTvKumandasi`
4. `AkilliRadyoKumandasi`
   *(Sınıf sayısı 4 oldu.)*

Patron ertesi gün geldi: *"Yeni bir cihaz ürettik: **DVD Player**"*
Eyvah! DVD için de hem normal hem akıllı kumanda yazman lazım:
5. `DvdKumandasi`
6. `AkilliDvdKumandasi`
   *(Sınıf sayısı 6 oldu.)*

Fark ettin mi? Her yeni Cihaz veya her yeni Kumanda türü eklendiğinde sınıflar **çarpılarak (Matematikteki Kartezyen Çarpım)** artıyor. 10 cihaz, 5 çeşit kumanda olsa **50 tane sınıf** yazman gerekir! Buna **Sınıf Patlaması** denir.

**Çözüm (Bridge Pattern Felsefesi):**
Bridge der ki: *"Kumanda ve Cihaz birbirinden bağımsız değişebilen iki farklı kavramdır. Bunları birbirine kalıtımla (extends) sıkı sıkıya bağlamak yerine, aralarına bir **Köprü** kur."* Yani Kumandanın içine bir tane Cihaz nesnesi yerleştir (Composition).

---

### 2. Kodla Anlatım

Bu desende iki ayrı hiyerarşi kurarız:
1. **Cihazlar Hiyerarşisi** (İşin mutfağı - Implementasyon)
2. **Kumandalar Hiyerarşisi** (Müşterinin gördüğü - Abstraction)

```java
// --- 1. CİHAZLARIN HİYERARŞİSİ (MUTFAK) ---

// Bütün cihazların uyması gereken kurallar
public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

public class TV implements Device {
    @Override
    public void turnOn() { System.out.println("TV Açıldı."); }
    @Override
    public void turnOff() { System.out.println("TV Kapandı."); }
    @Override
    public void setVolume(int volume) { System.out.println("TV Sesi ayarlandı: " + volume); }
}

public class Radio implements Device {
    @Override
    public void turnOn() { System.out.println("Radyo Açıldı."); }
    @Override
    public void turnOff() { System.out.println("Radyo Kapandı."); }
    @Override
    public void setVolume(int volume) { System.out.println("Radyo Sesi ayarlandı: " + volume); }
}


// --- 2. KUMANDALARIN HİYERARŞİSİ (MÜŞTERİ YÜZÜ) ---

// İŞTE KÖPRÜ BURADA KURULUYOR!
// Kumanda sınıfı, içine bir Device nesnesi alıyor. Hangi cihaz olduğunu bilmez, sadece köprüden ona emir gönderir.
public abstract class RemoteControl {
    protected Device device; // Köprümüz bu değişken! (Protected yaptık ki alt sınıflar kullansın)

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerButtonPressed();
}

// Basit Kumanda
public class BasicRemote extends RemoteControl {
    
    public BasicRemote(Device device) {
        super(device); // Cihazı üst sınıftaki köprüye yolla
    }

    @Override
    public void powerButtonPressed() {
        System.out.println("Basit Kumanda: Güç tuşuna basıldı.");
        device.turnOn(); // Köprüden karşıya geçip cihaza emir verdik
    }
}

// Akıllı Kumanda (Ekstra özelliği var: Mute)
public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void powerButtonPressed() {
        System.out.println("Akıllı Kumanda: Güç tuşuna basıldı.");
        device.turnOn();
    }

    // Akıllı kumandaya özel yepyeni bir özellik
    public void mute() {
        System.out.println("Akıllı Kumanda: Sessize alma tuşuna basıldı.");
        device.setVolume(0); // Köprüden geçip cihazın sesini 0 yaptı
    }
}
```

**Kullanım (Main Sınıfı):**
```java
public class Main {
    public static void main(String[] args) {
        // 1. Önce bir cihaz üret (Örn: TV)
        Device myTv = new TV();

        // 2. Bu TV'yi yönetecek bir Akıllı Kumanda üret. (Köprüyü inşa et)
        AdvancedRemote smartRemote = new AdvancedRemote(myTv);

        // 3. Kumandayı kullan
        smartRemote.powerButtonPressed();
        smartRemote.mute();
        
        System.out.println("-----------------");

        // 4. Bak ne kadar esnek! Aynı akıllı kumanda yapısıyla şimdi radyoyu yönetelim!
        Device myRadio = new Radio();
        AdvancedRemote radioRemote = new AdvancedRemote(myRadio);
        radioRemote.mute();
    }
}
```

---

### 3. Debug Mantığı: Kod Adım Adım Nasıl Çalışıyor?

Şimdi `smartRemote.mute();` dediğimizde arka planda akış nasıl sağlanıyor, köprüden nasıl geçiliyor izleyelim:

**ADIM 1: `new AdvancedRemote(myTv);`**
*   **Ne oluyor:** Müşteri `AdvancedRemote` nesnesini yaratırken, parametre olarak içine `myTv` nesnesini veriyor.
*   Bu `myTv` nesnesi, Abstract (Soyut) olan ana `RemoteControl` sınıfındaki `protected Device device;` değişkeninin içine atanıyor. **Köprü inşa edildi.** Artık kumanda kime emir vereceğini biliyor.

**ADIM 2: `smartRemote.mute();`**
*   **Ne oluyor:** Akış `AdvancedRemote` sınıfının içindeki `mute()` metoduna giriyor.
*   Ekrana `"Akıllı Kumanda: Sessize alma tuşuna basıldı."` yazdırıyor.
*   **Kritik Nokta:** Hemen alt satırda `device.setVolume(0);` kodu çalışıyor.

**ADIM 3: Köprüden Geçiş (`device.setVolume(0);`)**
*   **Ne oluyor:** Kumanda, kendi içindeki `device` değişkeninin `setVolume(0)` metodunu tetikliyor.
*   Peki `device` an itibariyle hangi cihaz? Program başlarken ona `myTv`'yi vermiştik.
*   Dolayısıyla akış dinamik olarak **`TV` sınıfının** içindeki `setVolume` metoduna atlıyor.
*   Ekrana `"TV Sesi ayarlandı: 0"` yazılıyor.

Eğer başlangıçta `Radio` verseydik, kod hiçbir değişikliğe uğramadan doğrudan `Radio` sınıfının içine düşecekti.

---

### Özetle Ne Kazandık? Neyi Çözdük?

Eğer bu köprüyü (Bridge) kurmasaydık ve eski "Amele" (Kalıtım/Extends) yöntemiyle gitseydik:
10 Cihaz ve 5 Kumanda türü için tam **50 tane sınıf** yazacaktık (`TvBasitKumanda`, `RadyoAkilliKumanda` vs. vs.)

**Bridge Pattern ile;**
Sadece 10 tane Cihaz Sınıfı + 5 tane Kumanda sınıfı yazdık. **Toplam 15 sınıf!**
50 nereee, 15 nere...

Bu desenin ana felsefesi şudur: **"İki farklı kavram (Kumanda ve Cihaz, Tema ve İşletim Sistemi, Şekil ve Renk) birbirinden bağımsız olarak çeşitleniyorsa, bunları iç içe geçirmek (extends) yerine yan yana koyup aralarına bir köprü at (composition)."**