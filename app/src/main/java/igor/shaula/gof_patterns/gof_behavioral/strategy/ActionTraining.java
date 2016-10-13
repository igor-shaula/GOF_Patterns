package igor.shaula.gof_patterns.gof_behavioral.strategy;

/**
 * @author igor shaula \
 */
public class ActionTraining implements StrategyAction {
    @Override
    public void doAction() {
        System.out.println("training...");
    }
}