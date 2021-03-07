package com.VB2020.ChainOfResponsibility;

public class GreenColorNotifier extends ColorNotifier{
    public GreenColorNotifier(COLORS color) {
        super(color);
    }

    @Override
    public void show(COLORS colorToNotify) {
        System.out.println("Notifying driver by GreenColorNotifier: " + colorToNotify);
    }
}
