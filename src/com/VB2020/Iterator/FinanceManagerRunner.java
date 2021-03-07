package com.VB2020.Iterator;

public class FinanceManagerRunner {
    public static void main(String[] args) {
        String[] clients = {"vlad", "andrew", "ann"};
        FinanceManager manager = new FinanceManager("Vladimir", clients);
        Iterator iterator = manager.getIterator();
        System.out.println("Manager: " + manager.getName());
        System.out.println("Has clients: ");

        while (iterator.hasNext())
        {
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
