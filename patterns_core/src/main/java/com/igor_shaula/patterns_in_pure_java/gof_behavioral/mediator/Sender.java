package com.igor_shaula.patterns_in_pure_java.gof_behavioral.mediator;

/**
 * @author igor shaula \
 */
public interface Sender {

    void sendMessage(String message);

    void getMessage(String message);
}