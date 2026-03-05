package com.lesson.singleton;

// Without Singleton:
//  Eğer şirkette 10.000 çalışan varsa ve maaş hesaplanıyorsa, hafızada (RAM) tam 10.000 tane ayrı Log nesnesi oluşur.
//  Hepsi aynı işi yapmasına rağmen hafızayı şişirirler (Memory Leak riskine yol açar).

/*
public class CalculateSalary {
    double salary = 100;

    public void calculateSeniorSalary() {
        try {
            salary = salary * 1.5;

            // YANLIŞ! Hoca bunu sildi.
            // Çünkü her maaş hesaplandığında RAM'de yepyeni bir Log nesnesi doğuyor.
            Log log = new Log();
            log.info("Yeni maaş: " + salary);

        } catch (Exception ex) {
            // YANLIŞ! Hoca bunu da sildi.
            // Sadece hata fırlattığında bile bellekte boşuna yeni obje oluşturuluyor.
            Log log = new Log();
            log.error(ex);
        }
    }
}
*/

// With Singleton:
//  Şimdi "new" kelimesini çöpe atıyoruz ve kendi yazdığımız kapıyı (logNesnesiVar()) kullanıyoruz.

public class CalculateSalary {
    double salary = 100;

    public void calculateSeniorSalary() {
        try {
            salary = salary * 1.5;

            // DOĞRU (Singleton Yaklaşımı):
            // "Bana sistemdeki TEK Log nesnesini getir" diyoruz.
            Log log = Log.logNesnesiVar();
            log.info("Senior maaşı hesaplandı: " + salary);

        } catch (Exception ex) {
            Log log = Log.logNesnesiVar(); // Hata olsa bile aynı nesneyi kullanır.
            log.error(ex);
        }
    }

    public void calculateJuniorSalary() {
        try {
            salary = salary * 1.2;

            // BAŞKA METOT BİLE OLSA AYNI NESNE GELİR!
            Log log = Log.logNesnesiVar();
            log.info("Junior maaşı hesaplandı: " + salary);

        } catch (Exception ex) {
            Log log = Log.logNesnesiVar();
            log.error(ex);
        }
    }
}

// Dependency Injection best practice:

/*
public class CalculateSalary {
    int salary = 100;

    // Bağımlılığı gizlemiyoruz, en tepeye koyuyoruz.
    private Log log;

    // CONSTRUCTOR INJECTION: "Bana bir Log nesnesi verin"
    public CalculateSalary(Log disaridanGelenLog) {
        this.log = disaridanGelenLog;
    }

    public void calculateSeniorSalary() {
        salary = salary * 1.5;
        log.info("Maaş: " + salary); // İçeride nesne üretme derdi bitti!
    }
}
 */