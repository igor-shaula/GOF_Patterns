package igor.shaula.gof_patterns.gof_behavioral.visitor;

/**
 * @author igor shaula \
 */
public class TaskTest implements TaskForVisitor {
    @Override
    public void workFor(VisitorDeveloper visitorDeveloper) {
        visitorDeveloper.workWith(this);
    }
}