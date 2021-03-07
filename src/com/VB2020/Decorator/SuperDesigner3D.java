package com.VB2020.Decorator;

public class SuperDesigner3D extends DesignerDecorator {
    public SuperDesigner3D(Designer designer) {
        super(designer);
    }

    // SuperDesigner3D может подготовить макет к печати
    // а не только его создавать как обычный Designer3D
    public String prepareMaketForPrint()
    {
        return "prepare maket for print...";
    }

    @Override
    public String createMaket() {
        return super.createMaket() + " and " + prepareMaketForPrint();
    }
}

