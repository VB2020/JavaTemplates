package com.VB2020.ChainOfResponsibility;

//светофор
public abstract class ColorNotifier {
    private COLORS color;
    private ColorNotifier nextColorNotifier;

    public ColorNotifier(COLORS color) {
        this.color = color;
    }

    public void setNextColorNotifier(ColorNotifier nextColorNotifier) {
        this.nextColorNotifier = nextColorNotifier;
    }

   public void notifyDriver(COLORS colorToNotify)
   {
        if (colorToNotify == color)
        {
            show(colorToNotify);
        }

        if(nextColorNotifier != null)
        {
            nextColorNotifier.notifyDriver(colorToNotify);
        }
   }

   public abstract void show(COLORS colorToNotify);
}
