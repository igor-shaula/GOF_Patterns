package com.igor_shaula.patterns_in_pure_java.gof_behavioral.strategy;

/**
 * @author igor shaula \
 */
public class StrategyDeveloper {

    private StrategyAction strategyAction;

    public void setStrategyAction(StrategyAction strategyAction) {
        this.strategyAction = strategyAction;
    }

    public void executeAction() {
        strategyAction.doAction();
    }
}