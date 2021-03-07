package com.VB2020.TemplateMethod;

public class SystemLogFile extends LogFileTemplate {
    @Override
    public void showLogContent() {
        System.out.println("this is for system file....\n");
    }
}
