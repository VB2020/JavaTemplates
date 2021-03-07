package com.VB2020.Observer;

public class SearchingNewBees {
    public static void main(String[] args) {
        BeeHive hive = new BeeHive();
        hive.addBee(1);
        hive.addBee(2);

        BeeObserver observer1 = new Bee(666);
        BeeObserver observer2 = new Bee(777);

        hive.addObserver(observer1);
        hive.addObserver(observer2);

        hive.addBee(3);

        hive.deleteBee(1);
    }
}
