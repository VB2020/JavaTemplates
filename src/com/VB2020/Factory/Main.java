package com.VB2020.Factory;

import com.VB2020.Factory.BankAccountFactoryImplementations.CreditBankAccountFactory;
import com.VB2020.Factory.BankAccountFactoryImplementations.PaymentBankAccountFactory;

public class Main {

    static BankAccountFactory createBankAccountByType (String accountType)
    {
        if (accountType.equalsIgnoreCase("credit"))
        {
            return new CreditBankAccountFactory();
        }
        else if (accountType.equalsIgnoreCase("current"))
        {
            return new CreditBankAccountFactory();
        }
        else if (accountType.equalsIgnoreCase("payment"))
        {
            return new PaymentBankAccountFactory();
        }
        else {
            throw new RuntimeException(accountType + " is unknown type of bankAccount!");
        }
    }

    public static void main(String[] args)
    {
        BankAccountFactory bankAccountFactory = createBankAccountByType("credit");
        BankAccount bankAccount = bankAccountFactory.createBankAccount();
        bankAccount.moneyTransfer(100);
    }
}
