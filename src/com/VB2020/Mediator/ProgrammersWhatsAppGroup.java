package com.VB2020.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersWhatsAppGroup implements WhatsAppGroup {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToGroup(User user)
    {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {

        for (User any_user: users)
        {
            if (any_user != user)
            {
                any_user.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
