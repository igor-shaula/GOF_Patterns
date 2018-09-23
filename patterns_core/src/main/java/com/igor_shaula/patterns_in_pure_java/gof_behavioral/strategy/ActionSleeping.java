package com.igor_shaula.patterns_in_pure_java.gof_behavioral.strategy;

/**
 * @author igor shaula \
 */
public class ActionSleeping implements StrategyAction {
    @Override
    public void doAction() {
        System.out.println("sleeping...");
    }
}