package igor.shaula.gof_patterns.gof_behavioral.visitor;

/**
 * @author igor shuala \
 */
public interface VisitorDeveloper {

    void workWith(TaskCode projectCode);

    void workWith(TaskTest projectTest);

    void workWith(TaskScheme projectScheme);

}