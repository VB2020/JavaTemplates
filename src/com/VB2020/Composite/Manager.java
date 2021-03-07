package com.VB2020.Composite;

public class Manager implements Worker {
    @Override
    public void workWithClients() {
        System.out.println("Manager speak with clients of bank...");
    }
}
