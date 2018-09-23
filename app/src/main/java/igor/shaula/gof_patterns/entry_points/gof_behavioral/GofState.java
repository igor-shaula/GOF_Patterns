package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.state.ActionSleeping;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.state.StateAction;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.state.StateDeveloper;

/**
 * Allow an object to alter its behavior when its internal state changes.
 * The object will appear to change its class.
 *
 * @author igor shaula \
 */
public class GofState {

    private AnswerFromPattern answerFromPattern;

    public GofState(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    // called from activity \
    public void doTheJob(int valueIn) {

        StateAction stateAction = new ActionSleeping();

        StateDeveloper stateDeveloper = new StateDeveloper();

        stateDeveloper.setStateAction(stateAction);

        if (valueIn < 1) {
            answerFromPattern.onJobDone("enter value greater than 1");
        }
        for (int i = 0; i < valueIn; i++) {
            stateDeveloper.doAction();
            stateDeveloper.changeAction();
        }
    }
}