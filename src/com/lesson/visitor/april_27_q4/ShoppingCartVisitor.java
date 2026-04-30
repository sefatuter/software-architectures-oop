package com.lesson.visitor.april_27_q4;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
