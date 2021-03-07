package com.VB2020.Command;

public class User {
    Command add;
    Command open;
    Command close;
    Command delete;

    public User(Command add, Command open, Command close, Command delete) {
        this.add = add;
        this.open = open;
        this.close = close;
        this.delete = delete;
    }

    public void addFile()
    {
        add.execute();
    }
    public void openFile()
    {
        open.execute();
    }
    public void closeFile()
    {
        close.execute();
    }
    public void deleteFile()
    {
        delete.execute();
    }
}
