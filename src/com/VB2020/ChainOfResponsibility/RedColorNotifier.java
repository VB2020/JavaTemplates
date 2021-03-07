package com.VB2020.ChainOfResponsibility;

public class RedColorNotifier extends ColorNotifier{

    public RedColorNotifier(COLORS color) {
        super(color);
    }

    @Override
    public void show(COLORS colorToNotify) {
        System.out.println("Notifying driver by RedColorNotifier: " + colorToNotify);
    }
}
