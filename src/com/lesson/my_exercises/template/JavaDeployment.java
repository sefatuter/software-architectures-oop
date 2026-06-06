package com.lesson.my_exercises.template;

public class JavaDeployment extends DeploymentPipeline{

    @Override
    void runTests() {
        System.out.println("JUnit testleri yapılıyor...");
    }

    @Override
    void compileCode() {
        System.out.println("Maven derlemesi yapılıyor...");
    }
}
