package com.lesson.my_exercises.proxy;

public class Main {
    public static void main(String[] args) {
        Database admin = new DatabaseProxy("ADMIN");
        admin.runQuery("SELECT * FROM users;");


        Database user = new DatabaseProxy("USER");
        user.runQuery("SELECT * FROM cars;");
    }
}
