package com.lesson.my_exercises.interpreter2;

public class Main {
    public static void main(String[] args) {

        RuleContext ruleContext = new RuleContext();

        ruleContext.addState("PREMIUM");
        ruleContext.addState("HAS_COUPON");

        Expression isPremium = new ConditionExpression("PREMIUM");
        Expression isGold = new ConditionExpression("GOLD");
        Expression hasCoupon = new ConditionExpression("HAS_COUPON");

        Expression premiumOrGold = new OrExpression(isPremium, isGold);

        Expression finalRule = new AndExpression(premiumOrGold, hasCoupon);

        boolean isEligible = finalRule.interpret(ruleContext);

        System.out.println("Does user satisfy the role: " + isEligible);

    }
}
