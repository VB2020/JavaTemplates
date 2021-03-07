package com.VB2020.AbstractFactory.PlasticCards;

import com.VB2020.AbstractFactory.PaymentAccount;

public class PaymentAccountCard implements PaymentAccount {
    @Override
    public void showPaymentAccount() {
        System.out.println("This is payment account for a card with payment account");

    }
}
