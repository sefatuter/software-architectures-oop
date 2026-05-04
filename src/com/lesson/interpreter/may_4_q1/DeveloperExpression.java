package com.lesson.interpreter.may_4_q1;

public class DeveloperExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        context.totalPoints += 20;
    }
}