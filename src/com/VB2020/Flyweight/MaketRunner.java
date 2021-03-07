package com.VB2020.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class MaketRunner {
    public static void main(String[] args) {
        WorkerFactory factory = new WorkerFactory();
        List<Worker> workers = new ArrayList<>();
        workers.add(factory.getWorkerBySpeciality("manager"));
        workers.add(factory.getWorkerBySpeciality("manager"));
        workers.add(factory.getWorkerBySpeciality("manager"));
        workers.add(factory.getWorkerBySpeciality("manager"));


        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));
        workers.add(factory.getWorkerBySpeciality("designer"));

        for (Worker worker : workers) {

            worker.doWork();
        }
    }
}
