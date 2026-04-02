package com.lesson.my_exercises.builder;

import com.lesson.my_exercises.prototype.Araba;

public class Person implements Cloneable{
    private String name, surname;
    private int age;

    public Person(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }

    @Override
    public Person clone(){
        try {
            return (Person) super.clone();
        } catch (Exception e){
            return null;
        }
    }

    public static class Builder {

        private String name, surname;
        private int age;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setSurname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

}
