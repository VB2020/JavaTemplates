package com.VB2020.AbstractFactory.Refinancing;

import com.VB2020.AbstractFactory.CreditAccount;

public class SpecialCreditAccount implements CreditAccount {

    RefinanceStatus status;

    public RefinanceStatus getStatus() {
        return status;
    }

    public void setStatus(RefinanceStatus status) {
        this.status = status;
    }

    @Override
    public void showCreditAccount() {
        setStatus(RefinanceStatus.ordinary_client);
        System.out.println("This is credit account with status: " + getStatus() + " for Refinancing project");
    }
}
