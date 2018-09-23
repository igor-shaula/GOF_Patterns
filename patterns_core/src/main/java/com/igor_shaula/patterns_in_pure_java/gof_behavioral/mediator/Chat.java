package com.igor_shaula.patterns_in_pure_java.gof_behavioral.mediator;

/**
 * @author igor shaula \
 */
public interface Chat {

    void sendMessage(String message, Sender sender);
}