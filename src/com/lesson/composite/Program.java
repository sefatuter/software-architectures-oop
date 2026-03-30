package com.lesson.composite;

public class Program {
    public static void main(String[] args) {
        // 1. En tepe yönetici (Kök / Root)
        SoftwareDeveloper manager = new SoftwareDeveloper("Boran", DeveloperType.Manager);

        // 2. Manager'a doğrudan bağlı Junior'lar ekle
        manager.addDeveloper(new Junior("Ahmet", DeveloperType.Junior));
        manager.addDeveloper(new Junior("Mehmet", DeveloperType.Junior));

        // 3. Bir ara yönetici (Dal / Composite) oluştur
        SoftwareDeveloper midSenior = new SoftwareDeveloper("Ali", DeveloperType.MidSenior);
        midSenior.addDeveloper(new Junior("X", DeveloperType.Junior));
        midSenior.addDeveloper(new Junior("Y", DeveloperType.Junior));

        // 4. Başka bir yönetici oluştur ve içine midSenior'u ekle
        SoftwareDeveloper senior = new SoftwareDeveloper("Metin", DeveloperType.Senior);
        senior.addDeveloper(midSenior);

        // 5. Senior ekibini, en tepedeki Manager'a bağla!
        manager.addDeveloper(senior);

        // YAPRAK TESTİ (Aşağıdaki kodları açarsan sistem Exception fırlatır, çünkü mantığa aykırı)
        /*
        Junior leaf1 = new Junior("Mert", DeveloperType.Junior);
        Junior leaf2 = new Junior("Utku", DeveloperType.Junior);
        leaf1.addDeveloper(leaf2); // HATA! Junior eleman ekleyemez.
        */

        System.out.println("--- ŞİRKET HİYERARŞİSİ ---");
        // SİHİRLİ DOKUNUŞ:
        // Main sınıfı kimin junior, kimin senior olduğunu bilmez.
        // Sadece "Boran, bana ekibini dök!" der. Boran herkese söyler, herkes kendi altına söyler.
        manager.print();
    }
}
