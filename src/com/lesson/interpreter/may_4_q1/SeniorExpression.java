package com.lesson.interpreter.may_4_q1;

public class SeniorExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        if (context.formula.contains("S")) {
            context.totalPoints += 15;
        }
    }
}