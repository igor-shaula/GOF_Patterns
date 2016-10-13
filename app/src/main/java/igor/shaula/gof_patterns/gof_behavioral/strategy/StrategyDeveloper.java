package igor.shaula.gof_patterns.gof_behavioral.strategy;

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