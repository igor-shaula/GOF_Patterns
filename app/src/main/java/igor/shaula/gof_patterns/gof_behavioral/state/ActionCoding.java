package igor.shaula.gof_patterns.gof_behavioral.state;

/**
 * @author igor shaula \
 */
public class ActionCoding implements StateAction {
    @Override
    public void doAction() {
        System.out.println("coding...");
    }
}