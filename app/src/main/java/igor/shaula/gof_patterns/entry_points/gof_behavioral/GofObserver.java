package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.observer.ObservableObject;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.observer.ObserverObject;

/**
 * Define a one-to-many dependency between objects where a state change in one object
 * results in all its dependents being notified and updated automatically.
 *
 * @author igor shaula \
 */
public class GofObserver {

    private AnswerFromPattern answerFromPattern;

    public GofObserver(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    // called from activity \
    public void doTheJob(int valueIn) {

        ObservableObject observableObject = new ObservableObject();

        new ObserverObject(answerFromPattern, observableObject);

        observableObject.setObservableValue(valueIn);
    }
}