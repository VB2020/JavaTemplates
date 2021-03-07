package com.VB2020.Visitor;

public class Engine implements CarPart {
    @Override
    public void beInstalled(Worker worker) {
        worker.install(this);
    }
}
