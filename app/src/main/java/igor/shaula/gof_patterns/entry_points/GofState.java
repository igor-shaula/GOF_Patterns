package igor.shaula.gof_patterns.entry_points;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_behavioral.state.Action;
import igor.shaula.gof_patterns.gof_behavioral.state.ActionSleeping;
import igor.shaula.gof_patterns.gof_behavioral.state.Developer;

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

        Action action = new ActionSleeping();

        Developer developer = new Developer();

        developer.setAction(action);

        if (valueIn < 1) {
            answerFromPattern.onJobDone("enter value greater than 1");
        }
        for (int i = 0; i < valueIn; i++) {
            developer.doAction();
            developer.changeAction();
        }
    }
}