package igor.shaula.gof_patterns.gof_behavioral.state;

/**
 * @author igor shaula \
 */
public class StateDeveloper {

    private StateAction stateAction;

    public void setStateAction(StateAction stateAction) {
        this.stateAction = stateAction;
    }

    public void changeAction() {
        // all magic is done here - generally actions go in pairs \
        if (stateAction instanceof ActionSleeping) {
            setStateAction(new ActionMoving());
        } else if (stateAction instanceof ActionMoving) {
            setStateAction(new ActionCoding());
        } else if (stateAction instanceof ActionCoding) {
            setStateAction(new ActionEating());
        } else if (stateAction instanceof ActionEating) {
            setStateAction(new ActionResting());
        } else if (stateAction instanceof ActionResting) {
            setStateAction(new ActionTraining());
        } else if (stateAction instanceof ActionTraining) {
            setStateAction(new ActionSleeping());
        }
    }

    public void doAction() {
        stateAction.doAction();
    }
}