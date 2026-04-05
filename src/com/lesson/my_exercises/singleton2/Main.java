package com.lesson.my_exercises.singleton2;

public class Main {
    public static void main(String[] args) {

        Sqlconn sqlconn = Sqlconn.openSqlConnection();

        Sqlconn sqlconn1 = Sqlconn.openSqlConnection();
    }
}
