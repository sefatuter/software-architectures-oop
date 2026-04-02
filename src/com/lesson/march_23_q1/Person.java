package com.lesson.march_23_q1;
// builder pattern
public class Person {
    private String name, surname, phone, address;
    private int age;

    // 1. Private Constructor: Nesne sadece Builder ile üretilebilir!
    private Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }

    // 2. Static İç Sınıf (Builder)
    public static class Builder {
        private String name, surname, phone, address;
        private int age;

        public Builder setName(String name) { this.name = name; return this; }
        public Builder setSurname(String surname) { this.surname = surname; return this; }
        public Builder setAge(int age) { this.age = age; return this; }

        public Person build() {
            return new Person(this); // Person nesnesini Builder'dan alarak üret
        }
    }
}
