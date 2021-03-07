package com.VB2020.Iterator;

public class FinanceManager implements AccountCollection {
    private String name;
    private String[] clients;

    public FinanceManager(String name, String[] clients) {
        this.name = name;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    @Override
    public Iterator getIterator() {
        return new ClientIterator();
    }

    private class ClientIterator implements Iterator
    {
        int index;
        @Override
        public Object next() {
            return clients[index++];
        }

        @Override
        public boolean hasNext() {
            if (index < clients.length)
            {
                return true;
            }
            else return false;
        }
    }
}
