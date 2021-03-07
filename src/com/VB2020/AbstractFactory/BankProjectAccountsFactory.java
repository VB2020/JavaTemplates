package com.VB2020.AbstractFactory;

public interface BankProjectAccountsFactory {
    CreditAccount  getCreditAccount();
    CurrentAccount getCurrentAccount();
    PaymentAccount getPaymentAccount();
}
