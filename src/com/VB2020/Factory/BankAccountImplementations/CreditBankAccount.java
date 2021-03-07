package com.VB2020.Factory.BankAccountImplementations;

import com.VB2020.Factory.BankAccount;

public class CreditBankAccount implements BankAccount {
    @Override
    public void moneyTransfer(int amount) {
        System.out.println("Transfers " + amount + " from/to CreditBankAccount");

    }
}
