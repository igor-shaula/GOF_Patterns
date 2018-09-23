package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor.Feedback;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor.TaskVenue;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor.VisitorDeveloper;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor.VisitorJunior;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor.VisitorMiddle;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor.VisitorSenior;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template method lets subclasses redefine certain steps of an algorithm
 * without changing the algorithm's structure.
 *
 * @author igor shaula \
 */
public class GofVisitor implements Feedback {

    private AnswerFromPattern answerFromPattern;

    public GofVisitor(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    // called from activity \
    public void doTheJob(int valueIn) {

        TaskVenue taskVenue = new TaskVenue();

        VisitorDeveloper junior = new VisitorJunior(this);
        VisitorDeveloper middle = new VisitorMiddle(this);
        VisitorDeveloper senior = new VisitorSenior(this);

        switch (valueIn % 2) {
            case 0:
                taskVenue.workFor(junior);
                break;
            case 1:
                taskVenue.workFor(middle);
                break;
            case 2:
                taskVenue.workFor(senior);
                break;
        }
    }

    @Override
    public void sendResult(String result) {

        answerFromPattern.onJobDone(result);
    }
}