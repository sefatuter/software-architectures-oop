package com.lesson.my_exercises.singleton2;

public class Sqlconn {
    private static Sqlconn sqlconn;

    private Sqlconn(){}

    public static Sqlconn openSqlConnection(){
        if (sqlconn == null){
            sqlconn = new Sqlconn();
            System.out.println("New created");
            return sqlconn;
        } else {
            System.out.println("Used old");
            return sqlconn;
        }
    }
}
