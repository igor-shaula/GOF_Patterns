package com.igor_shaula.patterns_in_pure_java.gof_behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * @author igor shaula \
 */
public class ChatRealization implements Chat {
    
    private User admin;
    
    private List<User> userList = new LinkedList<>();
    
    public void setAdmin(User admin) {
        this.admin = admin;
    }
    
    public void addUser(User user) {
        userList.add(user);
    }
    
    @Override
    public void sendMessage(String message, Sender sender) {
        
        for (User user : userList) {
            if (user != sender) {
                user.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}