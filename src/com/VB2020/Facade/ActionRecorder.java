package com.VB2020.Facade;

public class ActionRecorder {

    private boolean activeAction;

    public boolean isActiveAction()
    {
        return activeAction;
    }

    public void startAction()
    {
        System.out.println("Action is active...");
        activeAction = true;
    }

    public void endAction()
    {
        System.out.println("Action is not active...");
        activeAction = false;
    }
}
