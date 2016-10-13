package igor.shaula.gof_patterns.gof_behavioral.strategy;

/**
 * @author igor shaula \
 */
public class ActionSleeping implements StrategyAction {
    @Override
    public void doAction() {
        System.out.println("sleeping...");
    }
}