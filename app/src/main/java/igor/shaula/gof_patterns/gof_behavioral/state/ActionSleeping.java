package igor.shaula.gof_patterns.gof_behavioral.state;

/**
 * @author igor shaula \
 */
public class ActionSleeping implements Action {
    @Override
    public void doAction() {
        System.out.println("sleeping...");
    }
}