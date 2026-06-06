package com.lesson.my_exercises.memento2;

import java.util.Stack;

public class CheckpointManager {

    Stack<GameMemento> stack = new Stack<>();

    void saveCheckpoint(GameMemento memento){
        stack.push(memento);
    }

    GameMemento undo(){
        return stack.pop();
    }
}
