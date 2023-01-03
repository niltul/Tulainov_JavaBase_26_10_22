package com.hillel.tulainov.homeworks.homework15;

public class iPhones implements iOS, Smartphones {

    private String modelName;

    public iPhones(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String call() {
        return "Call made";
    }

    @Override
    public String sms() {
        return "Sms sent";
    }

    @Override
    public String internet() {
        return "Instagram opened";
    }

    @Override
    public String toString() {
        return modelName;
    }
}
