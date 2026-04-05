package com.lesson.my_exercises.builder2;

public class Pizza {
    private String toppings, dough;

    public Pizza(Builder builder){
        this.toppings = builder.toppings;
        this.dough = builder.dough;
    }

    public static class Builder{
        private String toppings, dough;

        public Builder setToppings(String toppings){ this.toppings = toppings; return this;}
        public Builder setDough(String dough){this.dough = dough; return this; }

        public Pizza build(){
            return new Pizza(this);
        }
    }

}

