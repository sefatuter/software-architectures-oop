package com.lesson.interpreter.may_4_q1;

// Open/Closed Principle örnegi

public class Main {
    public static void main(String[] args) {
        System.out.println("Architecture=5, Consultant=10, Senior=15, Developer=20");

        Context context = new Context("ACSSDDDD");
        RunExpression(context);

        Context context1 = new Context("CSDD");
        RunExpression(context1);

        Context context2 = new Context("SD");
        RunExpression(context2);
    }

    public static void RunExpression(Context context) {
        for (RoleExpression expression : Program.CreateExpressionTree(context.formula)) {
            expression.interpret(context);
        }
        System.out.println(context.totalPoints);
    }
}