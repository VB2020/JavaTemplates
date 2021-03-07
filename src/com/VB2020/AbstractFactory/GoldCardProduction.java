package com.VB2020.AbstractFactory;

import com.VB2020.AbstractFactory.PlasticCards.PlasticCardsFactory;

public class GoldCardProduction {
    public static void main(String[] args)
    {
        BankProjectAccountsFactory plasticCardsFactory = new PlasticCardsFactory();

        CreditAccount creditAccountCard = plasticCardsFactory.getCreditAccount();
        CurrentAccount currentAccountCard = plasticCardsFactory.getCurrentAccount();
        PaymentAccount paymentAccountCard = plasticCardsFactory.getPaymentAccount();

        System.out.println("Creating Plastic Cards System...");
        creditAccountCard.showCreditAccount();
        currentAccountCard.showCurrentAccount();
        paymentAccountCard.showPaymentAccount();
    }
}
