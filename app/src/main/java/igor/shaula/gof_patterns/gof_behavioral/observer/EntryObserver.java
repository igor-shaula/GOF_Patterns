package igor.shaula.gof_patterns.gof_behavioral.observer;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;

/**
 * Define a one-to-many dependency between objects where a state change in one object
 * results in all its dependents being notified and updated automatically.
 *
 * @author igor shaula \
 */
public class EntryObserver {

    private ObservableObject observableObject;

    public EntryObserver(AnswerFromPattern answerFromPattern) {

        observableObject = new ObservableObject();

        new ObserverObject(answerFromPattern, observableObject);
    }

    // called from activity \
    public void doTheJob(int valueIn) {
        observableObject.setObservableValue(valueIn);
    }
}