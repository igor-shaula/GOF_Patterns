package igor.shaula.gof_patterns.gof_behavioral.strategy;

/**
 * @author igor shaula \
 */
public class ActionMoving implements StrategyAction {
    @Override
    public void doAction() {
        System.out.println("moving...");
    }
}