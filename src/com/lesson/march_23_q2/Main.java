package com.lesson.march_23_q2;

public class Main {
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.model = "BMW";

        Araba araba2 = araba;

        araba2.model = "Audi Mercedes";

        System.out.println(araba.model);  // Audi
        System.out.println(araba2.model); // Audi

        //Önceden yazılmış bir makaleden birkaç cümleyi değiştirerek yeni bir tane oluşturmak
    }
}