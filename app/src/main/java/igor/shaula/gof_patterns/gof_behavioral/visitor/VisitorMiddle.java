package igor.shaula.gof_patterns.gof_behavioral.visitor;

/**
 * this is a concrete visitor's realization \
 *
 * @author igor shuala \
 */
public class VisitorMiddle implements VisitorDeveloper {

    private Feedback feedback;

    public VisitorMiddle(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public void workWith(TaskCode projectCode) {
        feedback.sendResult("code is written by middle");
    }

    @Override
    public void workWith(TaskTest projectTest) {
        feedback.sendResult("test is written by middle");
    }

    @Override
    public void workWith(TaskScheme projectScheme) {
        feedback.sendResult("scheme is created by middle");
    }
}