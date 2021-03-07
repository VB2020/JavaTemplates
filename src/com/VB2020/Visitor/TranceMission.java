package com.VB2020.Visitor;

public class TranceMission implements CarPart {
    @Override
    public void beInstalled(Worker worker) {
        worker.install(this);
    }
}
