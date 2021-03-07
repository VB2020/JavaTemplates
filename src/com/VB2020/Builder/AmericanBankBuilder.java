package com.VB2020.Builder;

public class AmericanBankBuilder extends BankBuilder {
    @Override
    void buildName() {
        bank.setName("Super Bank");
    }

    @Override
    void buildBankType() {
        bank.setTypeOfBank(BankType.EXCHANGER);
    }

    @Override
    void buildPrice() {
        bank.setPrice(777850);

    }
}
