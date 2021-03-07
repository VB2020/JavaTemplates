package com.VB2020.AbstractFactory.PlasticCards;

import com.VB2020.AbstractFactory.BankProjectAccountsFactory;
import com.VB2020.AbstractFactory.CreditAccount;
import com.VB2020.AbstractFactory.CurrentAccount;
import com.VB2020.AbstractFactory.PaymentAccount;

public class PlasticCardsFactory implements BankProjectAccountsFactory {
    @Override
    public CreditAccount getCreditAccount() {
        return new CreditAccountCard();
    }

    @Override
    public CurrentAccount getCurrentAccount() {
        return new CurrentAccountCard();
    }

    @Override
    public PaymentAccount getPaymentAccount() {
        return new PaymentAccountCard();
    }
}
