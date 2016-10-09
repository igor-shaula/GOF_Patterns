package igor.shaula.gof_patterns.gof_behavioral.iterator;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;

/**
 * Provide a way to access the elements of an aggregate object sequentially
 * without exposing its underlying representation.
 *
 * @author igor shaula \
 */
public class EntryIterator {

    private AnswerFromPattern answerFromPattern;

    public EntryIterator(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    public void doTheJob(int value) {

        Container container = new Container();
//        Container container = new Container(value);

        Iterator iterator = container.getIterator();
        String result = "";

        iterator.setPosition(value);
        while (iterator.hasNext()) {
            result = result.concat(iterator.getNext() + "\n");
        }
        answerFromPattern.onJobDone(result);
    }
}