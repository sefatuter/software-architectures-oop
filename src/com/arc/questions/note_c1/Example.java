package com.arc.questions.note_c1;

public class Example {
    public static void main(String[] args) {
        try(CustomResource resource = new CustomResource()){
            resource.doSomething();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
