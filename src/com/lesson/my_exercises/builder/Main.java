package com.lesson.my_exercises.builder;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person.Builder().
                setName("Ali")
                .setSurname("Can")
                .setAge(21)
                .build();

        // Person person2 = person1;

        Person person2 = person1.clone();

        System.out.println(person1);
        System.out.println(person2);
    }
}
