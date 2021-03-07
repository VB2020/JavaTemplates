package com.VB2020.Facade;

public class ActionRunner {
    public static void main(String[] args) {
        /*
        Action action = new Action();
        action.doAction();

        ActionRecorder actionRecorder = new ActionRecorder();
        //--------------------------------------
        actionRecorder.startAction();
        Game game = new Game();
        game.doActionBeforeLoadingGraphics(actionRecorder);
        actionRecorder.endAction();
        //--------------------------------------
        game.doActionBeforeLoadingGraphics(actionRecorder);

         */

        //лучший клиентский код
        GameFlow gameFlow = new GameFlow();
        gameFlow.solveGameProblems();
    }
}
