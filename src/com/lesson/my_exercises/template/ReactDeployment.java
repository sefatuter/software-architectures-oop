package com.lesson.my_exercises.template;

public class ReactDeployment extends DeploymentPipeline{
    @Override
    void runTests() {
        System.out.println("Jest testleri yapılıyor...");
    }

    @Override
    void compileCode() {
        System.out.println("Webpack derlemesi yapılıyor...");
    }

    @Override
    boolean runTestsHook() {
        return false;
    }
}
