package com.lesson.singleton;

public class Log {
    // 1. Kurucu metot gizli (Dışarıdan new Log() YASAK)
    private Log() { }

    // 2. Kendi nesnesini tutacak static değişken
    private static Log logNesnesi;

    // 3. Nesneyi verecek kapı (Hocanın sonradan eklediği kısım)
    public static Log logNesnesiVar() { // (Genelde getInstance denir)
        if (logNesnesi == null) {
            logNesnesi = new Log(); // Sadece ilk çağrıldığında 1 kez çalışır!
        }
        return logNesnesi; // Sonraki tüm çağrılarda var olanı gönderir.
    }

    // --- Normal Sınıf Metotları ---
    public void info(String message) {
        System.out.println("BİLGİ: " + message);
    }

    public void error(Exception ex) {
        System.out.println("HATA: " + ex.getMessage());
    }
}