package com.VB2020.ChainOfResponsibility;

public class Program {
    public static void main(String[] args) {
        ColorNotifier greenNotifier = new GreenColorNotifier(COLORS.GREEN);
        ColorNotifier yellowNotifier = new YellowColorNotifier(COLORS.YELLOW);
        ColorNotifier redNotifier = new RedColorNotifier(COLORS.RED);

        greenNotifier.setNextColorNotifier(yellowNotifier);
        yellowNotifier.setNextColorNotifier(redNotifier);

        greenNotifier.notifyDriver(COLORS.GREEN);

    }
}
