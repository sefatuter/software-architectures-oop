package com.lesson.my_exercises.template;

public abstract class DeploymentPipeline {

    final void deploy(){
        cloneRepository();
        if(runTestsHook()){
            runTests();
        }
        compileCode();
        publishArtifact();
    }

    abstract void runTests();
    abstract void compileCode();

    void cloneRepository(){
        System.out.println("Repository is clonning..");
    }

    void publishArtifact(){
        System.out.println("Publishing artifact..");
    }

    boolean runTestsHook(){
        return true;
    }
}
