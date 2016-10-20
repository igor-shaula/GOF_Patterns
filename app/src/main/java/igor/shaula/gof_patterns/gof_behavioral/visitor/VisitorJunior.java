package igor.shaula.gof_patterns.gof_behavioral.visitor;

/**
 * this is a concrete visitor's realization \
 *
 * @author igor shuala \
 */
public class VisitorJunior implements VisitorDeveloper {

    private Feedback feedback;

    public VisitorJunior(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public void workWith(TaskCode projectCode) {
        feedback.sendResult("code is written by junior");
    }

    @Override
    public void workWith(TaskTest projectTest) {
        feedback.sendResult("test is written by junior");
    }

    @Override
    public void workWith(TaskScheme projectScheme) {
        feedback.sendResult("scheme is created by junior");
    }
}