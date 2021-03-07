package com.VB2020.Factory.BankAccountFactoryImplementations;

import com.VB2020.Factory.BankAccount;
import com.VB2020.Factory.BankAccountFactory;
import com.VB2020.Factory.BankAccountImplementations.CreditBankAccount;

public class CreditBankAccountFactory implements BankAccountFactory {
    @Override
    public BankAccount createBankAccount() {
        return new CreditBankAccount();
    }
}
