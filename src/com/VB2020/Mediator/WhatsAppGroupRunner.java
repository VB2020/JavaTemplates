package com.VB2020.Mediator;

public class WhatsAppGroupRunner {
    public static void main(String[] args) {
        ProgrammersWhatsAppGroup group = new ProgrammersWhatsAppGroup();
        User admin = new Admin(group, "Admin_Vladimir");
        User user1 = new SimpleUser(group, "user_Andrew");
        User user2 = new SimpleUser(group, "user_Ann");

        group.setAdmin(admin);
        group.addUserToGroup(user1);
        group.addUserToGroup(user2);

        user1.sendMessage("Hi all!!!");
        admin.sendMessage("Hello, I am admin here!");

    }
}
