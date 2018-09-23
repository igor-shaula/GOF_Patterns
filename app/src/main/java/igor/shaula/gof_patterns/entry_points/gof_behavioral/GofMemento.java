package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.memento.Originator;

/**
 * Without violating encapsulation, capture and externalize an object's internal state
 * allowing the object to be restored to this state later.
 *
 * @author igor shaula \
 */
public class GofMemento {

//    private static final String CN = "GofMemento ` ";

    private AnswerFromPattern answerFromPattern;

    public GofMemento(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    public void doTheJob(int value) {

        // first given value will be saved and restored later \

        Originator originator = new Originator();

        originator.setCurrentState("first value = " + value);
        Originator.Memento memento = originator.saveStateToMemento();

        originator.setCurrentState("new value = " + value);

        originator.restoreStateFrom(memento);

        answerFromPattern.onJobDone("restored from memento:\n" + originator.getCurrentState());
    }
}