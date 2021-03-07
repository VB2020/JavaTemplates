package com.VB2020.Builder;

public abstract class BankBuilder {
    Bank bank;

    public void createBank(){
        bank = new Bank();
    }

    abstract void buildName();

    abstract void buildBankType();

    abstract void buildPrice();

    public Bank getBank()
    {
        return bank;
    }



}
