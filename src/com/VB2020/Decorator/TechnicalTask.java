package com.VB2020.Decorator;

public class TechnicalTask {
    public static void main(String[] args) {
        Designer designer = new Director(new SuperDesigner3D(new Designer3D()));
        System.out.println(designer.createMaket());
    }
}
