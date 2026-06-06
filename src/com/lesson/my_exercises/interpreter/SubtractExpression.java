package com.lesson.my_exercises.interpreter;

public class SubtractExpression implements Expression{
    int value;

    SubtractExpression(int value){
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        context.result -= value;
    }
}
