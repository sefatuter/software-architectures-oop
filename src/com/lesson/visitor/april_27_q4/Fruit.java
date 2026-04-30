package com.lesson.visitor.april_27_q4;

public class Fruit implements ItemElement{
    private int pricePerKg, weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm){
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerKg(){ return pricePerKg; }
    public int getWeight(){ return weight; }
    public String getName(){ return name; }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    } // Bu metodu çağıran mevcut Fruit objesini, visitor.visit(...) metoduna gönder
}
