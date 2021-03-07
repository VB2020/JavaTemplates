package com.VB2020.Builder;

public class Businessman {
    BankBuilder builder;

    public void setBuilder(BankBuilder builder) {
        this.builder = builder;
    }

    Bank createNewBank(){
        builder.createBank();
        builder.buildName();
        builder.buildBankType();
        builder.buildPrice();
        Bank bank = builder.getBank();
        return bank;
    }
}
