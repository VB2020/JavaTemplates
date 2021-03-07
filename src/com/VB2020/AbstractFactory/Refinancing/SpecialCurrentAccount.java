package com.VB2020.AbstractFactory.Refinancing;

import com.VB2020.AbstractFactory.CurrentAccount;

public class SpecialCurrentAccount implements CurrentAccount {
    RefinanceStatus status;

    public RefinanceStatus getStatus() {
        return status;
    }

    public void setStatus(RefinanceStatus status) {
        this.status = status;
    }

    @Override
    public void showCurrentAccount() {
        setStatus(RefinanceStatus.ordinary_client);
        System.out.println("This is current account with status: " + getStatus() + " for Refinancing project");
    }
}
