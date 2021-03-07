package com.VB2020.TemplateMethod;

public class LogFileRunner {
    public static void main(String[] args) {
        LogFileTemplate systemLog = new SystemLogFile();
        LogFileTemplate userLog = new UserLogFile();

        systemLog.showLogFile();
        System.out.println("///////////////////////////");
        userLog.showLogFile();
    }
}
