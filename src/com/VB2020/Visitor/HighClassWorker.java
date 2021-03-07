package com.VB2020.Visitor;

public class HighClassWorker implements Worker {
    @Override
    public void install(Engine engine) {
        System.out.println("Excellent engine installing");
    }

    @Override
    public void install(TranceMission tranceMission) {
        System.out.println("Excellent tranceMission installing");
    }
}
