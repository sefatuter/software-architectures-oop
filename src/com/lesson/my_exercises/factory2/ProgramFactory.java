package com.lesson.my_exercises.factory2;

public class ProgramFactory {
    public IProgram createProgram(String program){
        if (program.equals("Excel")){
            return new Excel();
        }
        else if (program.equals("Paint")) {
            return new Paint();
        }
        else {
            return null;
        }
    }
}
