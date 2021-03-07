package com.VB2020.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    public static final Map <String, Worker> workers = new HashMap<>();

    public Worker getWorkerBySpeciality(String speciality)
    {
        Worker worker = workers.get(speciality);

        if (worker == null)
        {
            switch (speciality)
            {
                case "designer":
                    System.out.println("Hiring new designer...");
                    worker = new Designer();
                    break;

                case "manager":
                    System.out.println("Hiring new manager...");
                    worker = new Manager();
                    break;
            }
            workers.put(speciality, worker);
        }
        return worker;
    }
}
