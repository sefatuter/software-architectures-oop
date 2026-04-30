# Visitor Pattern

-> Visitor,algoritmaları üzerlerinde çalıştıkları nesnelerden ayırmamıza olanak sağlayan behavioural tasarım desenidir.

-> visitor kalıbı yardımıyla operasyonel mantığı başka sınıflara taşıyabiliriz.

-> örnek; item sınıflarındaki hesaplamanın farklı sınıfta olması.

-> Bir sınıfa eklenecek yeni fonksiyonalite, visitor pattern sayesinde o sınıfın bir member'i olmaksızın ilgili sınıfa enjekte edilebilmektedir.

Visitor (Ziyaretçi) deseni, Behavioral (Davranışsal) desenler içinde anlaması en zor, ama anlaşıldığında "vay canına" dedirten desenlerden biridir.

### Neden Zor ve Neden Gerekli? (Mimar Mantığı)
Diyelim ki bir e-ticaret siten var ve ürünlerin (Meyve, Kitap) sınıfları zaten yazılmış.
Şimdi "Vergi Hesaplama", "Kargo Fiyatı Hesaplama", "İndirim Hesaplama" gibi yepyeni özellikler eklemek istiyorsun.
*Eğer Mimar (Architect) değilsen:* Gidip `Fruit` sınıfına `calculateTax()` eklersin, sonra `Book` sınıfına `calculateTax()` eklersin. (Bu SOLID'in S ve O prensiplerine aykırıdır. Sınıfları şişirirsin).
*Eğer Mimarsan:* Nesnelere dokunmazsın. Vergi hesaplayan bir "Ziyaretçi (Visitor)" yaratırsın. Ziyaretçi kapı kapı dolaşır, meyveyi ziyaret eder kargosunu hesaplar, kitabı ziyaret eder vergisini hesaplar!

**Amaç:** Mevcut sınıfların (Meyve, Kitap) **içine dokunmadan**, o sınıflar üzerinde yeni operasyonlar (İndirim Hesapla, Vergi Hesapla) yapabilmeyi sağlayan bir yapıdır.

**Sihirli Kelime ("Double Dispatch" - Çifte Dağıtım):**
Nesne ziyaretçiyi "kabul eder" (`accept`), ziyaretçi de nesneyi "ziyaret eder" (`visit`).

*   **En Büyük Gücü:** Eğer yarın "Kargo Hesaplama" diye yepyeni bir özellik gelirse, ne Meyve'ye ne Kitap'a dokunursun. Gidip `ShippingVisitor` adında yeni bir ziyaretçi yazar işin içinden çıkarsın!
*   **Dezavantajı:** Sisteme yeni bir işlem (Kargo) eklemek çok kolaydır. **AMA**, sisteme yeni bir ürün (Örn: `Meat / Et`) eklemek çok zordur. Çünkü yeni ürün eklersen, o zamana kadar yazılmış olan TÜM Ziyaretçi sınıflarına gidip `visit(Meat meat)` metodunu eklemek zorunda kalırsın.

**Visitor deseninin o meşhur `accept` ve `visit` tenis maçı (ping-pong) mantığı oturdu mu?** Ziyaretçi nesneye gidiyor (`accept`), nesne kendini ziyaretçiye geri yolluyor (`visit(this)`). Buna "Double Dispatch" denir.
