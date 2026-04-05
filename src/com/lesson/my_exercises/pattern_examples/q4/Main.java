package com.lesson.my_exercises.pattern_examples.q4;

/*
Görev: Eski Nesil Muhasebe Yazılımı Entegrasyonu
Kurallar:

    1. Şirketimizde uzun süredir kullandığımız ve gayet iyi çalışan bir YeniNesilMuhasebe arayüzümüz var. Bu sistemdeki tüm fatura işlemleri şu standart metoda göre yapılıyor: faturaKes(String musteriAdi, double tutar)
    2. Sistemi yazan tüm ekiplerimiz, arayüzlerimiz ve diğer servislerimiz bu metoda bağımlı şekilde çalışıyor (Projede yüzlerce yerde faturaKes çağrılıyor).
    3. Patron şirketi büyütme kararı aldı ve köklü, çok büyük ama oldukça "eski moda" çalışan bir e-devlet entegrasyon firmasıyla (X-Devlet A.Ş) anlaştı.
    4. X-Devlet A.Ş. bize kodları kapalı (kütüphane olarak) kendi EDevletFaturaSistemi sınıflarını yolladı.
    5. Sıkıntı şurada: Bu eski sistem faturaKes(isim, tutar) metodundan anlamıyor. Kendi içlerinde faturayı şöyle kesiyorlar: submitInvoiceData(double miktar, String isimKodu, String tarih) (Hem parametrelerin yeri değişik, hem ekstra "tarih" istiyor, hem de ismi İngilizce!).
    6. Meydan Okuma: Patron sana dedi ki: "Bizim projedeki o yüzlerce faturaKes metodunu tek tek bulup değiştirmekle uğraşamayız. Sistemi bozarız. Ama aynı zamanda adamların bize verdiği hazır submitInvoiceData kütüphanesini de kullanamıyoruz. Kendi sistemimizi hiç bozmadan, adamların koduna da dokunmadan (zaten kapalı kaynak) bu işi çöz."
    7. Sistemin faturaKes tetiklendiğinde arka planda gizlice submitInvoiceData çalıştırabilmelidir. Eksik olan "tarih" parametresine ise sistemin çalıştığı anki "Bugünün Tarihi" otomatik atanmalıdır.

 */

public class Main {
    public static void main(String[] args) {
        EDevletFaturaSistemi eDevletFaturaSistemi = new EDevletFaturaSistemi();
        YeniNesilMuhasebe adapter = new SystemAdapter(eDevletFaturaSistemi, "10.10.2010");
        adapter.faturaKes("Ali", 156.6);
    }
}
