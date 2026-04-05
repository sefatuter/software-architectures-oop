package com.lesson.my_exercises.factory2;

public class Main {
    public static void main(String[] args) {
        ProgramFactory programFactory = new ProgramFactory();
        IProgram myExcel = programFactory.createProgram("Excel");
        myExcel.openProgram();



    }
}
