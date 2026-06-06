package com.lesson.my_exercises.visitor;

public class PriceCalculatorVisitor implements Visitor{

    @Override
    public int visit(Book book) {
        if (book.price > 50){
            return book.price - 5;
        }
        return book.price;
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.weight * fruit.pricePerKg;
    }
}
