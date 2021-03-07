package com.VB2020.TemplateMethod;

public abstract class LogFileTemplate {
    public void showLogFile()
    {
        System.out.println("Log file for:");
        showLogContent();
        System.out.println("End of file");
    }

    public abstract void showLogContent();

}
