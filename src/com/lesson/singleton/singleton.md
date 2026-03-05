# Singleton Design Pattern (Tekil Nesne Deseni)

## 1. Temel Kural: Private Constructor (Gizli Yapıcı Metot)
Normalde bir sınıftan nesne üretmek için `new` anahtar kelimesi kullanılır. Ancak mimaride bazen bir nesneden **sadece 1 tane** olmasını isteriz.

Bunun önüne geçmenin tek yolu, sınıfın kurucu metodunu (Constructor) `private` yapmaktır.
*   **Hocanın Notu:** *Constructor private olursa, dışarıdan o class'tan nesne oluşturulamaz.*

```java
public class A {
    // Kurucu metot private! Dış dünyaya kapalı.
    private A() { } 
}

// Başka bir sınıfta (Örn: Main içinde) şunu YAPAMAZSIN:
// A a = new A(); // HATA VERİR! Çünkü A() gizlidir.
```

---

## 2. Singleton Nedir ve Neden Kullanılır?
*   **Amaç:** Uygulama çalıştığı sürece hafızada (RAM) bir sınıfın sadece **tek bir nesnesinin (instance)** bulunmasını garanti etmektir.
*   **Kullanım Alanları:** Veritabanı bağlantıları (DB Connection), Loglama işlemleri (Log), Ayarlar/Konfigürasyon dosyaları.
*   **Neden `new` ile sürekli üretmiyoruz?** Çünkü DB'ye bağlanmak veya dosyaya Log yazmak maliyetli (ağır) işlemlerdir. Her işlem için yeni nesne (`new`) üretirsek RAM dolar ve sistem yavaşlar. Bunun yerine 1 tane üretip herkesin onu kullanmasını sağlarız.

---

## 3. Temel Singleton Yapısı

### Doğru Singleton İskeleti (Lazy Initialization)
```java
public class Singleton {

    // 1. Adım: Dışarıdan "new" yapılmasını engelle.
    private Singleton() { }

    // 2. Adım: Kendi nesnesini hafızada tutacak "static" bir değişken yarat.
    // (Static olmalı ki sınıfa ait olsun, nesneye değil)
    private static Singleton nesne;

    // 3. Adım: Dış dünyanın bu nesneye ulaşması için bir "Kapı" (Metot) aç.
    public static Singleton nesneVar() { // Genelde "getInstance()" olarak isimlendirilir
        
        // Eğer nesne daha önce HİÇ OLUŞTURULMADIYSA, sadece 1 kereye mahsus oluştur.
        if (nesne == null) {
            nesne = new Singleton(); 
        }
        
        // Eğer zaten oluşturulduysa, var olanı geri gönder (Return).
        return nesne;
    }
}
```