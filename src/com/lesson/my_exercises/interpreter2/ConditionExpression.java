package com.lesson.my_exercises.interpreter2;

public class ConditionExpression implements Expression{

    private String state;

    ConditionExpression(String state){
        this.state = state;
    }

    @Override
    public boolean interpret(RuleContext context) {
        return context.states.contains(this.state);
    }
}
