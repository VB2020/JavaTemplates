package com.VB2020.Composite;

public class BankProject {
    public static void main(String[] args) {
        BankWorkers bankWorkers = new BankWorkers();

        Worker SeniorManager = new Manager();
        Worker MiddleManager = new Manager();
        Worker CashOperator = new Operator();

        bankWorkers.addWorker(SeniorManager);
        bankWorkers.addWorker(MiddleManager);
        bankWorkers.addWorker(CashOperator);

        bankWorkers.createBankProject();


    }
}
