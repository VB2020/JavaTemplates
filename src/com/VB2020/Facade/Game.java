package com.VB2020.Facade;

public class Game {
    public void doActionBeforeLoadingGraphics(ActionRecorder actionRecorder) {
        if (actionRecorder.isActiveAction())
        {
            System.out.println("Game is calculating all number characteristics of all units...");
        }
        else System.out.println("Game is wating...");
    }
}
