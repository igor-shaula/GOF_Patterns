package igor.shaula.gof_patterns.entry_points;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_behavioral.observer.ObservableObject;
import igor.shaula.gof_patterns.gof_behavioral.observer.ObserverObject;

/**
 * Define a one-to-many dependency between objects where a state change in one object
 * results in all its dependents being notified and updated automatically.
 *
 * @author igor shaula \
 */
public class Z_GofObserver {

    private ObservableObject observableObject;

    public Z_GofObserver(AnswerFromPattern answerFromPattern) {

        observableObject = new ObservableObject();

        new ObserverObject(answerFromPattern, observableObject);
    }

    // called from activity \
    public void doTheJob(int valueIn) {
        observableObject.setObservableValue(valueIn);
    }
}