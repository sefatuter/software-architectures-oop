package com.lesson.proxy.april_13_q1;

import java.util.jar.JarOutputStream;

public class Proxy implements ISubject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        if (CheckAccess()){
            realSubject.request();
            LogAccess();
        }
    }

    public boolean CheckAccess(){
        System.out.println("Proxy checking access prior to firing a real request");
        return true;
    }

    public void LogAccess(){
        System.out.println("Proxy: Logging the time of request");
    }

}
