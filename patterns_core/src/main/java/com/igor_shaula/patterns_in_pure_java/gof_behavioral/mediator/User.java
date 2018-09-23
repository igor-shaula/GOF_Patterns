package com.igor_shaula.patterns_in_pure_java.gof_behavioral.mediator;

/**
 * @author igor shaula \
 */
public class User implements Sender {
    
    private Chat chat;
    
    private String name;
    
    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void sendMessage(String message) {
        // all magic is here \
        chat.sendMessage(message, this);
    }
    
    @Override
    public void getMessage(String message) {
        System.out.println(name + " got message: " + message);
    }
}