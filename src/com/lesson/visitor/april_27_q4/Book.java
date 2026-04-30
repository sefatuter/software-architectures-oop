package com.lesson.visitor.april_27_q4;

public class Book implements ItemElement{
    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn){
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice(){ return price; }
    public String getisbnNumber(){ return isbnNumber; }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
