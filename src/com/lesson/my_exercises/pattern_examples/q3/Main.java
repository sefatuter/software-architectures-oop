package com.lesson.my_exercises.pattern_examples.q3;

/*

Görev: Kargo ve Fiyat Hesaplama Sistemi
Kurallar:
    1. Bir e-ticaret sisteminde kargolanacak ögeler iki çeşittir: Tekil Ürünler (Telefon, Kitap vb.) ve Kutular.
    2. Bir Kutu, içine birden fazla Tekil Ürün alabilir.
    3. Ancak daha da karmaşığı; Bir Kutu, içine başka küçük Kutular da alabilir. (İç içe geçmiş matruşka bebekleri gibi düşünebilirsin).
    4. Sistemin en önemli amacı, müşteriye gönderilecek kargonun toplam fiyatını fiyatHesapla() metodu ile bulmaktır.
    5. Eğer fiyatHesapla() metodu tek bir Ürün için çağrılırsa, sadece o ürünün fiyatını dönmelidir.
    6. Eğer fiyatHesapla() metodu bir Kutu için çağrılırsa, içindeki tüm ürünlerin ve alt kutuların fiyatlarını otomatik olarak toplayıp dönmelidir.
    7. EN ÖNEMLİ KURAL: Ana programda (Main sınıfı) toplam fiyat hesaplanırken KESİNLİKLE if (oge instanceof Kutu) veya if (oge instanceof Urun) gibi amele kontrolleri yapılamaz. Sistem (Client), karşısındakinin tek bir ürün mü yoksa içi dolu devasa bir koli mi olduğunu umursamadan tek bir metotla işi çözmelidir.

composite pattern

 */

public class Main {
    public static void main(String[] args) {

        Box b1 = new Box(10);
        Box b2 = new Box(12);

        Item phone = new Item(20);
        Item book = new Item(5);

        b1.add(phone);
        b1.add(phone);
        b2.add(book);

        b1.fiyatHesapla();

        System.out.println("Toplam Kargo Maliyeti: " + b2.fiyatHesapla() + " TL");

    }
}
