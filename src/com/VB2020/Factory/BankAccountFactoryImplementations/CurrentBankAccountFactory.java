package com.VB2020.Factory.BankAccountFactoryImplementations;

import com.VB2020.Factory.BankAccount;
import com.VB2020.Factory.BankAccountFactory;
import com.VB2020.Factory.BankAccountImplementations.CurrentBankAccount;

public class CurrentBankAccountFactory implements BankAccountFactory {
    @Override
    public BankAccount createBankAccount() {
        return new CurrentBankAccount();
    }
}
