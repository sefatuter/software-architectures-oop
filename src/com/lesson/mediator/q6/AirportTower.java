package com.lesson.mediator.q6;

import java.util.ArrayList;
import java.util.List;

class AirportTower implements ControlTower {
    private List<Airplane> airplanes = new ArrayList<>();

    public void registerAirplane(Airplane a) { airplanes.add(a); }

    @Override
    public void requestLanding(Airplane senderPlane) {
        // İniş isteyen uçağa cevap ver:
        senderPlane.receiveMessage("Kule: İniş izni onaylandı. Piste inebilirsiniz.");

        // DİĞER TÜM UÇAKLARA BİLGİ VER:
        for (Airplane plane : airplanes) {
            if (plane != senderPlane) { // Kendisi hariç herkese!
                plane.receiveMessage("Kule: Dikkat! Başka bir uçak iniyor, havada beklemede kalın.");
            }
        }
    }
}
