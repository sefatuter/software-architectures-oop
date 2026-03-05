package com.arc.oop.abstraction.ex_2;

public class Main {
    public static void main(String[] args) {

        // 1. Doğrudan Alt Sınıf Referansı ile Oluşturma
        InkjetPrinter hp = new InkjetPrinter("HP Deskjet 2700");
        hp.powerOn();             // Ortak metot (BasePrinter'dan)
        hp.printDocument("CV.pdf"); // Ezilmiş (Override) metot

        System.out.println("---------------------------");

        // 2. POLYMORPHISM (Mimaride En Çok Kullanılan Yöntem)
        // Referans: BasePrinter (Baba), Nesne: LaserPrinter (Çocuk)
        BasePrinter samsung = new LaserPrinter("Samsung Xpress");

        samsung.powerOn();
        samsung.printDocument("Project_Report.docx");

        System.out.println("---------------------------");

        // 3. MİMARİ AVANTAJ: Liste İçinde Farklı Yazıcılar
        // Bir ofisimiz olduğunu ve içinde farklı yazıcılar olduğunu hayal et
        BasePrinter[] officePrinters = {
                new InkjetPrinter("Epson L3150"),
                new LaserPrinter("Brother HL-L2350"),
                new LaserPrinter("Canon imageCLASS")
        };

        System.out.println("Printing Office Queue...");
        for (BasePrinter printer : officePrinters) {
            printer.printDocument("Office_Note.txt");
            // Döngü her döndüğünde, nesne hangisiyse onun print metodu çalışır!
        }

        // 4. HATIRLATMA: Abstract sınıftan nesne üretilemez!
        // BasePrinter printer = new BasePrinter("General"); // BU SATIR HATA VERİR!
    }
}
