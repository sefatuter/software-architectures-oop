package com.lesson.interpreter.may_4_q1;

/*
-> Ör: MDCLXVI -> (M = 1000, D = 500, C = 100, L = 50, X = 10, V = 5, I = 1)
1664
 */

public class Context {
    public String formula;
    public int totalPoints;

    public Context(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}