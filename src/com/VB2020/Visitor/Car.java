package com.VB2020.Visitor;

public class Car implements CarPart {

    CarPart[] carParts;

    public Car() {
        this.carParts = new CarPart[] {
                new Engine(),
                new TranceMission()
        };
    }

    @Override
    public void beInstalled(Worker worker) {

        for (CarPart part: carParts)
        {
            part.beInstalled(worker);
        }

    }
}
