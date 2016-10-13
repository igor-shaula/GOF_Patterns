package igor.shaula.gof_patterns.gof_behavioral.state;

/**
 * @author igor shaula \
 */
public class ActionEating implements StateAction {
    @Override
    public void doAction() {
        System.out.println("eating...");
    }
}