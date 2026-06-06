package com.lesson.my_exercises.interpreter2;

public class OrExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    OrExpression(Expression expression1, Expression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(RuleContext context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
