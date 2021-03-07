package com.VB2020.Observer;

import java.util.ArrayList;
import java.util.List;

public class BeeHive implements BeeObserved {

    List<Integer> bees = new ArrayList<>();
    List<BeeObserver> beeObservers = new ArrayList<>();

    public void addBee (Integer beeNumberIsNewBee){
        this.bees.add(beeNumberIsNewBee);
        notifyAllObservers();
    }

    public void deleteBee (Integer beeNumber){
        this.bees.remove(beeNumber);
        notifyAllObservers();
    }
    @Override
    public void addObserver(BeeObserver observer) {
        this.beeObservers.add(observer);

    }

    @Override
    public void deleteObserver(BeeObserver observer) {
        this.beeObservers.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        for (BeeObserver observer: beeObservers) {
            observer.handleEvent(this.bees);
        }

    }
}
