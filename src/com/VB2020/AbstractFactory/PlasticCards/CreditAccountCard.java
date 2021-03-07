package com.VB2020.AbstractFactory.PlasticCards;

import com.VB2020.AbstractFactory.CreditAccount;

public class CreditAccountCard implements CreditAccount {
    @Override
    public void showCreditAccount() {
        System.out.println("This is credit account for a card with credit account");

    }
}
