package com.VB2020.Facade;

// компоновка всех элементов системы
public class GameFlow {
    Game game = new Game();
    Action action = new Action();
    ActionRecorder actionRecorder = new ActionRecorder();

    public void solveGameProblems()
    {
        action.doAction();
        actionRecorder.startAction();
        game.doActionBeforeLoadingGraphics(actionRecorder);
    }
}
