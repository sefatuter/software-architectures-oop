package com.lesson.prototype.march_23_q2;

// 1. KURAL: Sınıf "Cloneable" arayüzünü implement etmelidir!
public class Person implements Cloneable {
    private String name;
    private String surname;
    private int age;

    // Setter Metotları
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setAge(int age) { this.age = age; }

    public void print() {
        System.out.printf("Name: %s, Surname: %s, Age: %d %n", name, surname, age);
    }

    // 2. KURAL: clone() metodunu Override (Ezmek)
    @Override
    public Person clone() {
        try {
            // super.clone() var olan nesnenin birebir kopyasını oluşturur.
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}