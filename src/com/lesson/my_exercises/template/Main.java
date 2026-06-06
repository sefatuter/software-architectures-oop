package com.lesson.my_exercises.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("Deploying java:");
        JavaDeployment javaDeployment = new JavaDeployment();
        javaDeployment.deploy();
        System.out.println("--------------------------");
        System.out.println("Deploying React");
        ReactDeployment reactDeployment = new ReactDeployment();
        reactDeployment.deploy();

    }
}
