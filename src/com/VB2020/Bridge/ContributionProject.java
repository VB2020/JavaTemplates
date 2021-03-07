package com.VB2020.Bridge;

// Проект банковского вклада
public class ContributionProject extends Account {
    protected ContributionProject(FinanceManager financeManager) {
        super(financeManager);
    }

    @Override
    public void sendMoneyTo(int amount, Account from, Account to) {
        System.out.println("ContributionProject creating is in progress...");
        financeManager.createAccount();

    }
}

