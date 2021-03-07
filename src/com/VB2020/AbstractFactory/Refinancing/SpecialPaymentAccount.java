package com.VB2020.AbstractFactory.Refinancing;

import com.VB2020.AbstractFactory.PaymentAccount;

public class SpecialPaymentAccount implements PaymentAccount {
    RefinanceStatus status;

    public RefinanceStatus getStatus() {
        return status;
    }

    public void setStatus(RefinanceStatus status) {
        this.status = status;
    }

    @Override
    public void showPaymentAccount() {
        setStatus(RefinanceStatus.VIP_client);
        System.out.println("This is payment account with status: " + getStatus() + " for Refinancing project");
    }
}
