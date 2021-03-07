package com.VB2020.Visitor;

public class LowClassWorker implements Worker {
    @Override
    public void install(Engine engine) {
        System.out.println("Bad engine installing");
    }

    @Override
    public void install(TranceMission tranceMission) {
        System.out.println("Bad tranceMission installing");
    }
}
