package com.lesson.my_exercises.singleton;

public class Logger {
    private static Logger _logger;

    private Logger(){}

    public static Logger createSingletonInstance(){
        if (_logger == null){
            _logger = new Logger();
            System.out.println("First time created");
            return _logger;
        }
        System.out.println("Using created one.");
        return _logger;
    }
}
