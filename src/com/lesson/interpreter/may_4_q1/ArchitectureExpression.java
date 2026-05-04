package com.lesson.interpreter.may_4_q1;

public class ArchitectureExpression extends RoleExpression {
    @Override
    public void interpret(Context context) {
        if (context.formula.contains("A")) {
            context.totalPoints += 5;
        }
    }
}