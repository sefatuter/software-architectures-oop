package com.lesson.singleton;

public class Main {
    // Singleton singleton = new Singleton(); -> Çalışmaz. Private yaptık

    Log nesne1 = Log.logNesnesiVar();
    Log nesne2 = Log.logNesnesiVar();
    Log nesne3 = Log.logNesnesiVar();

    // Bu üçü de hafızadaki AYNI nesnedir! Adresleri aynıdır.
    // 10.000 maaş da hesaplansa, RAM'de sadece 1 adet Log nesnesi vardır.
}
