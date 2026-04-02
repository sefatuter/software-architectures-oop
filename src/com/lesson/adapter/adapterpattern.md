## Adapter Design Pattern

-> structural design patterndir.

Amaç:

-> İki uyumsuz interface'i beraber kullanmamızı sağlar.

-> Gerçek Hayat Analojisi (Priz Adaptörü)

Avrupa'ya (sistemin geneli) seyahat ettin ve elinde Amerika fişli (Codex) bir şarj aleti var. Amerika fişini Avrupa prizine (Crypt interface) doğrudan takamazsın, çünkü uçları uyumsuzdur.
Ne yaparsın? Araya bir "Adaptör" takarsın. Adaptörün bir tarafı Avrupa prizine uygundur, diğer tarafı Amerika fişini kabul eder. Elektrik (veri) sorunsuz akar.

Adapter Pattern (Adaptör Tasarım Deseni), adı üstünde tam olarak günlük hayatta kullandığımız **priz adaptörleri** veya **Type-C'den USB'ye dönüştürücüler** ile birebir aynı mantıkta çalışır.

### 1. Mantık Nedir? Neden İhtiyaç Duyarız?

**Gerçek Hayat Senaryosu:**
Amerika'dan bir telefon aldın ve şarj aletinin uçları **düz** (Amerikan fişi). Ama senin evindeki prizler **yuvarlak** (Avrupa/Türkiye prizi).
*   Evi yıkıp prizleri mi değiştirirsin? (Sistemini bozmak)
*   Şarj aletinin uçlarını penseyle büküp kırmaya mı çalışırsın? (Kütüphaneyi/Sınıfı bozmak)
*   **Çözüm:** Araya 50 liraya aldığın küçük bir plastik **Adaptör** takarsın. Priz onu yuvarlak sanır, şarj aleti ise düz fişe girdiğini sanır. Herkes mutludur.

**Yazılımdaki Karşılığı:**
Elinde birbiriyle uyumsuz iki sınıf veya arayüz (interface) vardır.
Örneğin; senin projenin her yerinde ödeme almak için `pay(int amount)` diye bir metot kullanılıyordur. Patron gelir der ki: *"Yeni bir ödeme sistemi aldım (örneğin Iyzico), artık bunu kullanacağız."*
Ama Iyzico'nun yazılımcıları kendi sistemlerini yazarken metoda `makePayment(int tutar)` adını vermişlerdir.

Sen Iyzico'nun kodunu değiştiremezsin (çünkü dışarıdan indirdiğin bir kütüphane/jar dosyasıdır). Kendi projendeki binlerce satır `pay()` kodunu da `makePayment()` olarak değiştirmek istemezsin. İşte araya bir **Adapter** yazarsın.

---

### 2. Kodla Anlatım

Önce elimizdeki uyumsuzluğa bakalım, sonra adaptörle çözelim.

```java
// 1. Bizim Sistemimizin Anladığı Dil (Hedef Arayüz - Prizimiz)
public interface PaymentProcessor {
    void pay(int amount);
}

// 2. Dışarıdan Gelen Yeni ve Uyumsuz Sistem (Adaptee - Amerikan Fişi)
// (Bu kodu bizim YAZMADIĞIMIZI, dışarıdan kütüphane olarak geldiğini düşün)
public class IyzicoApi {
    public void makePayment(int tutar) {
        System.out.println("Iyzico üzerinden " + tutar + " TL çekildi.");
    }
}

// 3. İŞTE KAHRAMANIMIZ: ADAPTÖR SINIFI
// Bizim sistemimiz gibi davranır (implements PaymentProcessor)
// Ama içinde gizliden gizliye Iyzico'yu çalıştırır.
public class IyzicoAdapter implements PaymentProcessor {
    
    private IyzicoApi iyzicoApi; // İçine uyumsuz sınıfı koyuyoruz

    public IyzicoAdapter(IyzicoApi iyzicoApi) {
        this.iyzicoApi = iyzicoApi;
    }

    // Bizim sistemimizin beklediği metot!
    @Override
    public void pay(int amount) {
        // Gelen amount (miktar) bilgisini, uyumsuz olan Iyzico'nun anlayacağı dile çeviriyoruz
        System.out.println("Adaptör devrede: pay() metodu makePayment() metoduna dönüştürülüyor...");
        iyzicoApi.makePayment(amount); 
    }
}
```

**Kullanım (Main Sınıfı):**
```java
public class Main {
    public static void main(String[] args) {
        
        // Uyumsuz olan Iyzico nesnesi
        IyzicoApi iyzico = new IyzicoApi();
        
        // Iyzico'yu Adaptörün içine yerleştiriyoruz (Amerikan fişini dönüştürücüye taktık)
        PaymentProcessor paymentSystem = new IyzicoAdapter(iyzico);
        
        // Müşteri (Client) sadece "pay" metodunu bilir. Iyzico'dan haberi bile yoktur!
        paymentSystem.pay(100); 
    }
}
```

---

### 3. Debug Mantığı: Kod Adım Adım Nasıl Çalışıyor?

Kodun nasıl aktığına (debug) adım adım bakalım:

**ADIM 1: `paymentSystem.pay(100);`**
*   **Ne oluyor:** Bizim ana programımız (müşteri ekranı), arayüzde standart olarak bildiği `pay()` metodunu çağırıyor ve 100 değerini gönderiyor. Ana program Iyzico diye bir şeyin varlığından **tamamen habersiz.** O sadece karşısında `PaymentProcessor` standartlarına uyan bir sistem olduğunu sanıyor. (Priz, kendisine yuvarlak fiş girdiğini sanıyor).

**ADIM 2: Adaptörün İçi (Çeviri Aşaması)**
*   **Ne oluyor:** Çağrı `IyzicoAdapter` sınıfının içindeki `pay(int amount)` metoduna düşüyor.
*   Adaptör diyor ki: *"Tamam, ana program benden 100 TL ödeme almamı istedi. Ama benim elimdeki gerçek ödeme motoru (IyzicoApi) `pay` kelimesinden anlamaz. O `makePayment` anlar."*

**ADIM 3: `iyzicoApi.makePayment(amount);`**
*   **Ne oluyor:** Adaptör, kendisine gelen `amount` (100) değerini alıyor ve gizlice içinde tuttuğu `iyzicoApi` nesnesinin `makePayment(100)` metoduna iletiyor. Çeviri yapıldı!

**ADIM 4: Hedefe Ulaşım**
*   **Ne oluyor:** Ekrana *"Iyzico üzerinden 100 TL çekildi."* yazısı basılıyor. İşlem başarılı.

---

### Özetle Ne Fark Var "Düz" Çağırmaktan? Neyi Çözdük?

Eğer adaptör yazmasaydık, projemizdeki ödeme butonunun olduğu yere şunu yazmak zorundaydık:
`iyzico.makePayment(100);`

**E ne var bunda yazsaydık?**
1.  Diyelim ki projende 50 farklı yerde ödeme alınıyor (Sepette, abonelikte, faturada). 50 yere de bunu yazdın.
2.  Altı ay sonra patron geldi dedi ki: *"Iyzico çok komisyon kesiyor, Stripe'a geçiyoruz."*
3.  **Geçmiş olsun.** Gidip o 50 yerdeki `makePayment()` kodlarını bulup silmen ve Stripe'ın metodunu yazman gerekecek. Hata yapma riskin çok yüksek.

**Adaptör (Adapter) kullansaydık ne olurdu?**
Projenin o 50 yerinde sadece `paymentSystem.pay(100)` yazardı.
Stripe'a mı geçtik? Gidip bir tane `StripeAdapter` yazarız. Ana koddaki 50 yere **ASLA DOKUNMAYIZ.**

İşte Adapter Pattern'in arkasındaki büyü budur: **Kodunu dışa bağımlılıklardan (3. parti kütüphanelerden) korur ve esneklik sağlar.** Müşteri kodu (senin projen) sadece senin belirlediğin standart interface'i (`pay`) bilir. Gerisini adaptörler halleder.