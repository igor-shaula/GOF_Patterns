package igor.shaula.gof_patterns.gof_behavioral.observer;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;

/**
 * kind of a listener for ObservableObject \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class ObserverObject implements MyObserver {

    AnswerFromPattern answerFromPattern;

    // all linking are done here - in the constructor \
    public ObserverObject(AnswerFromPattern answerFromPattern, ObservableObject observableObject) {
        this.answerFromPattern = answerFromPattern;
        observableObject.registerObserver(this);
    }

    // is invoked from interface inside Observable - here we only receive new data \
    @Override
    public void update(int newValue) {
        answerFromPattern.onJobDone("received from observable: " + newValue);
    }
}