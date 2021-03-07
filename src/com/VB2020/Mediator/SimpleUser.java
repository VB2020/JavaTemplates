package com.VB2020.Mediator;

public class SimpleUser implements User{

    WhatsAppGroup group;
    String simpleUserName;

    public SimpleUser(WhatsAppGroup group, String simpleUserName) {
        this.group = group;
        this.simpleUserName = simpleUserName;
    }

    public String getSimpleUserName() {
        return simpleUserName;
    }

    public void setSimpleUserName(String simpleUserName) {
        this.simpleUserName = simpleUserName;
    }


    @Override
    public void sendMessage(String message) {
        group.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.simpleUserName + " receiving message: " + message + ".");
    }
}
