package com.lesson.my_exercises.pattern_examples.q5;

/*
Görev: Çapraz Platform (Cross-Platform) Arayüz Kütüphanesi
Kurallar:

    1. Şirketimiz hem Windows hem de MacOS işletim sistemlerinde native (yerel) olarak çalışacak bir masaüstü uygulaması geliştiriyor.
    2. Ekranda iki temel UI (Kullanıcı Arayüzü) bileşeni kullanacağız: Buton ve OnayKutusu (Checkbox).
    3. Windows'un butonu ve onay kutusu ile Mac'in butonu ve onay kutusu tasarımsal olarak birbirinden tamamen farklıdır. (Yani arkada WinButon, MacButon, WinOnayKutusu, MacOnayKutusu gibi ayrı sınıflar olmalıdır).
    4. Uygulamayı kodlayan geliştirici (Main sınıfı), ekrana bir buton veya onay kutusu eklemek istediğinde her seferinde if (os == "Windows") { new WinButon(); } else { new MacButon(); } gibi amele if-else blokları yazmak KESİNLİKLE istemiyor.
    5. EN ÖNEMLİ KURAL: Sistemde yanlışlıkla bir WinButon ile MacOnayKutusu'nun aynı ekranda (çapraz ve uyumsuz şekilde) üretilme ihtimali tamamen ortadan kaldırılmalıdır. Ürünler her zaman kendi işletim sistemi "ailesiyle" (family) birlikte, bir takım halinde üretilmelidir.

Item interface
Button class implement Item
Checkbox class implements Item

AbstractFactory class

FactoryProducer class

Windows Class extends AbstractFactory
Macos Class extends AbstractFactory

 */

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Windows");
        Button button1 = abstractFactory.getButton("Button");
        button1.create();
    }
}
