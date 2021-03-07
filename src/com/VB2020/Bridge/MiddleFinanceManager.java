package com.VB2020.Bridge;

public class MiddleFinanceManager implements FinanceManager {
    @Override
    public void createAccount() {
        System.out.println("MiddleFinanceManager creates simple account");
    }
}
