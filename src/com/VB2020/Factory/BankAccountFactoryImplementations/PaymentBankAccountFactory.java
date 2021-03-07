package com.VB2020.Factory.BankAccountFactoryImplementations;

import com.VB2020.Factory.BankAccount;
import com.VB2020.Factory.BankAccountFactory;
import com.VB2020.Factory.BankAccountImplementations.PaymentBankAccount;

public class PaymentBankAccountFactory implements BankAccountFactory {
    @Override
    public BankAccount createBankAccount() {
        return new PaymentBankAccount();
    }
}
