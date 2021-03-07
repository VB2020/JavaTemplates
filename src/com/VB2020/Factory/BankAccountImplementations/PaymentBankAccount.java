package com.VB2020.Factory.BankAccountImplementations;

import com.VB2020.Factory.BankAccount;

public class PaymentBankAccount implements BankAccount {
    @Override
    public void moneyTransfer(int amount) {
        System.out.println("Transfers " + amount + " from/to PaymentBankAccount");

    }
}
