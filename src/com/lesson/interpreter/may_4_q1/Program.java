package com.lesson.interpreter.may_4_q1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static List<RoleExpression> CreateExpressionTree(String formula) {
        List<RoleExpression> tree = new ArrayList<RoleExpression>();

        for (char role : formula.toCharArray()) {
            if (role == 'A') {
                tree.add(new ArchitectureExpression());
            } else if (role == 'S') {
                tree.add(new SeniorExpression());
            } else if (role == 'D') {
                tree.add(new DeveloperExpression());
            } else if (role == 'C') {
                tree.add(new ConsultantExpression());
            }
        }

        return tree;
    }
}