package com.VB2020.Observer;

import java.util.List;

public class Bee implements BeeObserver {
    // порядковый номер пчелы)
    private Integer beeNumber;

    public Bee(Integer beeNumber) {
        this.beeNumber = beeNumber;
    }

    @Override
    public void handleEvent(List<Integer> bees) {
        System.out.println("Bee № " + beeNumber + "\n We have some new bees to work with: " + bees);

    }
}
