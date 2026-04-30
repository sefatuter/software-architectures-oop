package com.lesson.mediator.q6;

public class Main {
    public static void main(String[] args) {
        // 1. Kuleyi oluştur
        ControlTower kule = new AirportTower();

        // 2. Uçakları yarat ve kuleye bağla (Uçaklar birbirini tanımaz!)
        CommercialPlane thy = new CommercialPlane("THY-1453", kule);
        CommercialPlane pegasus = new CommercialPlane("PGS-1923", kule);

        // 3. THY uçağı iniş izni ister. SİHİR BURADA BAŞLAR!
        System.out.println("--- THY İnişe Geçiyor ---");
        thy.land();
    }
}
