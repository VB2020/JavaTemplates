package com.VB2020.Bridge;

public abstract class Account {

    private int currentAmount;

    protected FinanceManager financeManager;

    protected Account(FinanceManager financeManager, int currentAmount) {
        this.financeManager = financeManager;
        this.currentAmount = currentAmount;
    }

    public Account(FinanceManager financeManager) {
        this.financeManager = financeManager;
    }

    public synchronized void sendMoneyTo(int amount, Account from, Account to)
    {
        from.currentAmount -= amount;
        to.currentAmount += amount;
    }
}
