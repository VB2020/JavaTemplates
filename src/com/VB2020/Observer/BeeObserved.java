package com.VB2020.Observer;

// улей - наблюдаемый обьект
public interface BeeObserved {
    public void addObserver(BeeObserver observer);
    public void deleteObserver(BeeObserver observer);
    public void notifyAllObservers();
}
