package com.VB2020.Decorator;

public class DesignerDecorator implements Designer {

    Designer designer;

    public DesignerDecorator(Designer designer) {
        this.designer = designer;
    }

    @Override
    public String createMaket() {
        return designer.createMaket();
    }
}
