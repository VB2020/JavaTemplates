package com.VB2020.Proxy;

public class CarExecutor {
    public static void main(String[] args) {
        Car car = new ProxyCar("simple key");
        car.startCarEngine();
    }
}
