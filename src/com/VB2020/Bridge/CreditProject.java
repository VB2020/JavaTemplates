package com.VB2020.Bridge;

public class CreditProject extends Account {
    protected CreditProject(FinanceManager financeManager) {
        super(financeManager);
    }

    @Override
    public void sendMoneyTo(int amount, Account from, Account to) {
        System.out.println("CreditProject creating is in progress...");
        financeManager.createAccount();

    }
}
