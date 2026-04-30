# Observer Pattern

-> Behavioural bir patterndir

-> Bir nesnenin iç durumunda meydana gelen değişiklikleri takip etmek isteyen diğer nesnelere bildirmek için kullanılır.

->Örneğin, E-ticaret sitesindeki bir ürünün stok ve fiyat değişiklikleri ürün ile ilgilenen ziyaretçilere bildirmek için Observer Design Pattern'i kullanabiliriz.

-> Bir nesne durumunu değiştirdiğinde tüm bağımlıları (observers) otomatik olarak bildilendirilir.

**Amaç:** Bir nesnede (Ürün/Stok) değişiklik olduğunda, onu takip eden (abone olan) diğer nesneleri (Müşteriler) otomatik olarak bilgilendirmektir.

**Felsefesi:** "Hollywood Prensibi" olarak da bilinir: Bizi arama, bir şey değiştiğinde biz seni ararız. (Müşteri sürekli "Stok geldi mi?" diye veritabanını yormaz, stok gelince sistem müşteriye mesaj atar).

**İki Temel Aktör:**
- Subject (Yayıncı/Takip Edilen): İçinde bir abone listesi tutar. Durumu değiştiğinde listesindeki herkese haber verir.
- Observer (Abone/Gözlemci): Yayıncıyı takip eder. Yayıncıdan "Güncelleme var" emri geldiğinde kendi update() metodunu çalıştırır.
