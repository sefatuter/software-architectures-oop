package com.lesson.composite;
import java.util.ArrayList;
import java.util.List;

public class SoftwareDeveloper extends Developer {

    // Altındaki çalışanları tutan liste (Sihir burada!)
    private List<Developer> developers = new ArrayList<>();

    public SoftwareDeveloper(String name, DeveloperType type) {
        super(name, type); // Üst sınıfın constructor'ına gönder
    }

    @Override
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    @Override
    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void print() {
        System.out.println(type + " : " + name);

        // Kendi altındaki herkese "Kendini yazdır" emri veriyor.
        for (Developer item : developers) {
            item.print(); // RECURSIVE (Özyinelemeli) ÇAĞRI
        }
    }
}
