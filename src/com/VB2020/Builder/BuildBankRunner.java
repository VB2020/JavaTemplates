package com.VB2020.Builder;

public class BuildBankRunner {
    public static void main(String[] args) {
        Businessman businessman = new Businessman();
        businessman.setBuilder(new RussianBankBuilder());
        Bank bank = businessman.createNewBank();

        System.out.println(bank);
    }
}
