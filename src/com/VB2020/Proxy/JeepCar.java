package com.VB2020.Proxy;

public class JeepCar implements Car {

    private String key;

    public JeepCar(String key) {
        this.key = key;
        openCar();
    }

    public void openCar(){
        System.out.println("Opening car with " + key + "...");

    }
    @Override
    public void startCarEngine() {
        System.out.println("Jeep's engine is starting by " + key + "...");
    }
}
