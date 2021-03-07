package com.VB2020.Bridge;

public class AccountCreator {
    public static void main(String[] args) {
        Account[] accounts =
        {
                new CreditProject(new MiddleFinanceManager()),
                new ContributionProject(new SeniorFinanceManager())
        };
        Account friendAccount = null;
        Account myAccount = null;

        for(Account account: accounts)
        {
            account.sendMoneyTo(500, friendAccount, myAccount);
        }
    }
}
