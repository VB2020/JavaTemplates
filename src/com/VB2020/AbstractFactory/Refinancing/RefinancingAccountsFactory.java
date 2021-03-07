package com.VB2020.AbstractFactory.Refinancing;

import com.VB2020.AbstractFactory.BankProjectAccountsFactory;
import com.VB2020.AbstractFactory.CreditAccount;
import com.VB2020.AbstractFactory.CurrentAccount;
import com.VB2020.AbstractFactory.PaymentAccount;

public class RefinancingAccountsFactory implements BankProjectAccountsFactory {
    @Override
    public CreditAccount getCreditAccount() {
        return new SpecialCreditAccount();
    }

    @Override
    public CurrentAccount getCurrentAccount() {
        return new SpecialCurrentAccount();
    }

    @Override
    public PaymentAccount getPaymentAccount() {
        return new SpecialPaymentAccount();
    }
}
