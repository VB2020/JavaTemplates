package com.VB2020.Composite;

import java.util.ArrayList;
import java.util.List;

public class BankWorkers {

    private List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker)
    {
        workers.remove(worker);
    }

    public void createBankProject()
    {
        System.out.println("Creating a new bank project...\n");
        for (Worker worker: workers)
        {
            worker.workWithClients();
        }
    }
}
