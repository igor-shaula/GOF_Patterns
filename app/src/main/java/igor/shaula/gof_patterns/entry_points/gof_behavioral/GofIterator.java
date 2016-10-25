package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_behavioral.iterator.Container;
import igor.shaula.gof_patterns.gof_behavioral.iterator.Iterator;

/**
 * Provide a way to access the elements of an aggregate object sequentially
 * without exposing its underlying representation.
 *
 * @author igor shaula \
 */
public class GofIterator {

    private AnswerFromPattern answerFromPattern;

    public GofIterator(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    public void doTheJob(int value) {

        Container container = new Container();

        Iterator iterator = container.getIterator();
        iterator.setPosition(value);

        String result = "";
        while (iterator.hasNext()) {
            result = result.concat(iterator.getNext() + "\n");
        }
        answerFromPattern.onJobDone(result);
    }
}