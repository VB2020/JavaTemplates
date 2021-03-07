package com.VB2020.Decorator;

public class Director extends DesignerDecorator {
    public Director(Designer designer) {
        super(designer);
    }

    public String sendDirectorMarkForMaket()
    {
        return "send director mark for maket";
    }

    // директор иногда и дизайнером работает))
    // так как он опытный
    @Override
    public String createMaket() {
        return super.createMaket() + " and " + sendDirectorMarkForMaket();
    }
}
