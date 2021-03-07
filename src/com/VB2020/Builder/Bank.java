package com.VB2020.Builder;

public class Bank {
    private String name;
    private BankType typeOfBank;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfBank(BankType typeOfBank) {
        this.typeOfBank = typeOfBank;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", typeOfBank=" + typeOfBank +
                ", price=" + price +
                '}';
    }
}
