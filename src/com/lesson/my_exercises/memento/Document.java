package com.lesson.my_exercises.memento;

public class Document {
    String content;

    Memento save(){
        return new Memento(content);
    }

    void restore(Memento m){
        this.content = m.state;
    }

}
