package com.VB2020.Visitor;

public class CarBuildingRunner {
    public static void main(String[] args) {
        Car car = new Car();

        Worker badWorker = new LowClassWorker();
        Worker goodWorker = new HighClassWorker();

        System.out.println("LowClassWorker is working....");
        car.beInstalled(badWorker);

        System.out.println("/////////////////////////////////");

        System.out.println("HighClassWorker is working....");
        car.beInstalled(goodWorker);
    }
}
