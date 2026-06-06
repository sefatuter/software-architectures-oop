package com.lesson.my_exercises.visitor;

public class Main {
    public static void main(String[] args) {
        Element[] items = {new Book(), new Fruit()};

        Visitor calculator = new PriceCalculatorVisitor();
        int totalSum = 0;

        for (Element item: items){
            totalSum += item.accept(calculator);
        }

        System.out.println("Total Cost: " + totalSum);

    }
}
