package com.VB2020.Singleton;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccountLogger.getAccountLogger().addLogInfo("some action1 with your account....");
        BankAccountLogger.getAccountLogger().addLogInfo("some action2 with your account....");
        BankAccountLogger.getAccountLogger().addLogInfo("some action3 with your account....");

        BankAccountLogger.getAccountLogger().showLogInfo();
    }


}
