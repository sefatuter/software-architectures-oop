package com.lesson.prototype.march_23_q2;

public class Program
{
    public static void main(String[] args){

        Person ins1 = new Person();

        ins1.setName("Naim");
        ins1.setSurname("Ölçer");
        ins1.setAge(40);

        // İŞTE PROTOTYPE PATTERN!
        // "new Person()" demek yerine, var olanı kopyaladık (Clone).
        Person ins2 = ins1.clone();

        System.out.println("Instance 1:");
        ins1.print(); // Naim Ölçer 40

        System.out.println("Instance 2:");
        ins2.print(); // Naim Ölçer 40

        // İkinci nesneyi kopyaladıktan sonra BİRİNCİYİ değiştirelim
        ins1.setAge(42);
        ins1.setName("Naim1");
        ins1.setSurname("Ölçer2");

        System.out.println("\nInstance 1 After Change:");
        ins1.print(); // Naim1 Ölçer2 42

        System.out.println("Instance 2 After Change:");
        ins2.print(); // Naim Ölçer 40 (ETKİLENMEDİ!)
    }
}
