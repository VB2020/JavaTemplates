package com.VB2020.Builder;

public class RussianBankBuilder extends BankBuilder {
    @Override
    void buildName() {
        bank.setName("Альфа Банк");
    }

    @Override
    void buildBankType() {
        bank.setTypeOfBank(BankType.CREDITOR);
    }

    @Override
    void buildPrice() {
        bank.setPrice(999999);

    }
}
