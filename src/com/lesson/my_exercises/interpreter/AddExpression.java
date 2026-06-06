package com.lesson.my_exercises.interpreter;

public class AddExpression implements Expression{

    int value;

    AddExpression(int value){
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        context.result += value;
    }
}
