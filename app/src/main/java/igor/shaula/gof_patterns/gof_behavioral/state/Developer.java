package igor.shaula.gof_patterns.gof_behavioral.state;

/**
 * @author igor shaula \
 */
public class Developer {

    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeAction() {
        // all magic is done here - generally actions go in pairs \
        if (action instanceof ActionSleeping) {
            setAction(new ActionMoving());
        } else if (action instanceof ActionMoving) {
            setAction(new ActionCoding());
        } else if (action instanceof ActionCoding) {
            setAction(new ActionEating());
        } else if (action instanceof ActionEating) {
            setAction(new ActionResting());
        } else if (action instanceof ActionResting) {
            setAction(new ActionTraining());
        } else if (action instanceof ActionTraining) {
            setAction(new ActionSleeping());
        }
    }

    public void doAction() {
        action.doAction();
    }
}