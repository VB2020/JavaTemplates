package com.VB2020.Singleton;

public class BankAccountLogger {
    private static BankAccountLogger logger;
    private static String log = "This is account log...\n\n";

    public static synchronized BankAccountLogger getAccountLogger()
    {
        if (logger == null)
        {
            logger = new BankAccountLogger();
        }
        return logger;
    }

    private BankAccountLogger(){}

    public void addLogInfo(String logInfo)
    {
        log += logInfo + "\n";
    }

    public void showLogInfo()
    {
        System.out.println(log);
    }
}
