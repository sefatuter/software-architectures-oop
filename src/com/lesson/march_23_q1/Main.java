package com.lesson.march_23_q1;

public class Main {
    public static void main(String[] args) {

        // Sadece istediğin özellikleri ekleyerek nesneyi inşa et
        Person p1 = new Person.Builder()
                .setName("Ahmet")
                .setSurname("Yılmaz")
                .setAge(25)
                .build();

        // İster sadece isim ve soyisim ekle
        Person p2 = new Person.Builder()
                .setName("Ayşe")
                .setSurname("Demir")
                .build();
    }
}
    /*
    Araba araba = new Araba.builder(BMW)
            klima(true)
            abs(true)
            build();


    // nesneyi ihtiyacım oldugu kadar olusturuyorum

    Pizza pizza = new Pizza.builder()
        .AddCheese()
        .AddPeperoni()
        .AddPepper()



    ----
    builder'siz

    Araba araba = new Araba();
    araba.setklima(true)
    araba.setAbs(true);

*/

