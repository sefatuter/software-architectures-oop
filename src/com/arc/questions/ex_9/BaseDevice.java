package com.arc.questions.ex_9;

public abstract class BaseDevice implements ISmartDevice{

    private String deviceName;

    public BaseDevice(String deviceName){
        this.deviceName = deviceName;
    }

    void showStatus(){
        System.out.println("Ready to use.");
    }
}
