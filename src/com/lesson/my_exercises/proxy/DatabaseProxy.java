package com.lesson.my_exercises.proxy;

public class DatabaseProxy implements Database{

    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole){
        this.userRole = userRole;
    }

    @Override
    public void runQuery(String query) {
        if(checkAccess()){
            if(realDatabase == null){
                realDatabase = new RealDatabase(); // referansı doldur
            }
            realDatabase.runQuery(query);
            logAccess();
        } else {
            System.out.println("Access denied.");
        }
    }

    private boolean checkAccess(){
        return "ADMIN".equals(userRole);
    }

    private void logAccess(){
        System.out.println("Log: Query executed at " + System.currentTimeMillis());
    }
}
