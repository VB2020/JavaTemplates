package com.VB2020.AbstractFactory.PlasticCards;

import com.VB2020.AbstractFactory.CurrentAccount;

public class CurrentAccountCard implements CurrentAccount {
    @Override
    public void showCurrentAccount() {
        System.out.println("This is current account for a card with current account");

    }
}
