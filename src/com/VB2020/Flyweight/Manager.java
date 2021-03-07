package com.VB2020.Flyweight;

public class Manager implements Worker {
    @Override
    public void doWork() {
        System.out.println("Manager speaks with clients and prepares technical task for designer...");
    }
}
