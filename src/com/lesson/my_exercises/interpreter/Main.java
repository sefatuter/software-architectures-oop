package com.lesson.my_exercises.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Expression> rules = new ArrayList<>();

        Context context = new Context(); // 1. İşlem yapılacak kara tahtayı (Hafızayı) yarat

        rules.add(new AddExpression(10));
        rules.add(new SubtractExpression(3));

        for (Expression rule: rules){
            rule.interpret(context);
        }

        System.out.println("Result: " + context.result);
    }
}
