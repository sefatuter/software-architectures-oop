package com.lesson.adapter.march_23_q3;

// Adapter Pattern

public class Main {
    public static void main(String[] args) {
        // 1. Normal Sistem: CryptA kullanımı
        Crypt cryptA = new CryptA();
        cryptA.encrypt("Yusuf");
        cryptA.decrypt("Metin");

        System.out.println("-----------------");

        // 2. Normal Sistem: CryptB kullanımı
        Crypt cryptB = new CryptB();
        cryptB.encrypt("Dilek");
        cryptB.decrypt("Mehmet");

        System.out.println("-----------------");

        // 3. ADAPTER KULLANIMI: Uyumsuz Codex'i sisteme entegre etmek
        // Önce uyumsuz nesneyi üretiyoruz
        Codex codex = new Codex();

        // Sonra onu adaptörün içine takıyoruz.
        // Artık "crypt2" değişkeni sanki normal bir Crypt nesnesiymiş gibi davranıyor!
        Crypt crypt2 = new CodexAdapter(codex);

        // Biz encrypt dedik, arka planda textToCode çalıştı!
        crypt2.encrypt("Umut");
        crypt2.decrypt("Ahmet");
    }
}
