package com.VB2020.ChainOfResponsibility;


public class YellowColorNotifier extends ColorNotifier{
    public YellowColorNotifier(COLORS color) {
        super(color);
    }

    @Override
    public void show(COLORS colorToNotify) {
        System.out.println("Notifying driver by YellowColorNotifier: " + colorToNotify);
    }
}
