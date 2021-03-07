package com.VB2020.AbstractFactory;

import com.VB2020.AbstractFactory.Refinancing.RefinancingAccountsFactory;

public class RefinancingSystem {
    public static void main(String[] args) {

        BankProjectAccountsFactory RefinancingFactory = new RefinancingAccountsFactory();

        CreditAccount creditAccountCard = RefinancingFactory.getCreditAccount();
        CurrentAccount currentAccountCard = RefinancingFactory.getCurrentAccount();
        PaymentAccount paymentAccountCard = RefinancingFactory.getPaymentAccount();

        System.out.println("Creating Refinancing System...");
        creditAccountCard.showCreditAccount();
        currentAccountCard.showCurrentAccount();
        paymentAccountCard.showPaymentAccount();

    }
}
