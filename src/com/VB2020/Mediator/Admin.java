package com.VB2020.Mediator;

public class Admin implements User {
    WhatsAppGroup group;
    String adminName;

    public Admin(WhatsAppGroup group, String adminName) {
        this.group = group;
        this.adminName = adminName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public void sendMessage(String message) {
        group.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.adminName + " receiving message: " + message + ".");
    }


}
