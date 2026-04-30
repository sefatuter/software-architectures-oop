package com.lesson.mediator.q6;

class CommercialPlane implements Airplane {
    private String name;
    private ControlTower tower; // İçinde kuleyi tutuyor (Dependency)

    public CommercialPlane(String name, ControlTower tower) {
        this.name = name;
        this.tower = tower;
        this.tower.registerAirplane(this); // Sisteme (Kuleye) kayıt ol!
    }

    public void land() {
        System.out.println(name + ": Kule, iniş izni istiyorum!");
        tower.requestLanding(this); // Kuleye haber ver (this = ben)
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(name + " duydu -> " + msg);
    }
}
