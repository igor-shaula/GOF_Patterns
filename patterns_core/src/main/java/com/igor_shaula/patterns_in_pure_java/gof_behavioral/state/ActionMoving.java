package com.igor_shaula.patterns_in_pure_java.gof_behavioral.state;

/**
 * @author igor shaula \
 */
public class ActionMoving implements StateAction {
    
    @Override
    public void doAction() {
        System.out.println("moving...");
    }
}