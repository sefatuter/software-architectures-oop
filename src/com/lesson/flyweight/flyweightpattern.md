# Flyweight Pattern

* Nesneleri yeni oluşturmak yerine daha önceden önbelleğe alınmış nesneleri döndüren tasarım
* Structural
* Bellek tüketimini düşük tutmayı amaçlar
* RAM sıkıntısı çekiliyorsa bu model dikkate alınılabilir

**Amaç:** Çok sayıda benzer nesne oluşturmanın yaratacağı RAM (Bellek) israfını önlemek için, **nesneleri ortak bir havuzda (Cache/HashMap) tutup tekrar tekrar paylaşmak**.

**Gerçek Hayat Analojisi (Orman ve Ağaçlar):**
Bir oyunda 100.000 tane çam ağacı çizeceksin. Her ağaç için ayrı bir "Yaprak Dokusu (Texture)" ve "Gövde" nesnesi (`new Tree()`) üretirsen bilgisayarın RAM'i çöker.
*Çözüm:* Sadece 1 tane `Tree` nesnesi üretirsin (Flyweight). 100.000 farklı yere sadece bu ağacın **koordinatlarını** (X, Y) gönderirsin.

**Mimarın Altın Kuralı (Mülakat Sorusu!):**
Flyweight deseninde nesnenin özellikleri ikiye ayrılır:
1.  **Intrinsic (İçsel) Durum:** Paylaşılan, değişmeyen kısımdır (Örn: Çam ağacının yeşil dokusu veya "Arial" font ailesi). *Obje içinde tutulur.*
2.  **Extrinsic (Dışsal) Durum:** Kullanıldığı yere göre değişen kısımdır (Örn: Ağacın X,Y koordinatı veya senin örneğindeki "This is a sample text" yazısı). *Dışarıdan parametre olarak verilir.*

**Notlarındaki Kod İçin Küçük Bir Uyarı:** Normalde kusursuz bir Flyweight deseninde `color`, `size` gibi özellikler objenin içine `set` edilmez, `display(text, color, size)` şeklinde dışarıdan parametre olarak verilir ki diğer kullananlar etkilenmesin. Ama temel mantığı (HashMap ile Cacheleme) anlamak için yazdığın kod harika bir örnektir!

Bir sonraki tasarım deseni ile devam edelim mi? Sırada hangisi var? (Muhtemelen Decorator veya Structural'dan kalan diğerleri)