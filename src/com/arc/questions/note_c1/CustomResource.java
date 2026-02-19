package com.arc.questions.note_c1;

class CustomResource implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("Resource Closed!");
    }
    public void doSomething(){
        System.out.println("Doing something...");
    }
}
