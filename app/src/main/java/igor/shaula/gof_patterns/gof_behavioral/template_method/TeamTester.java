package igor.shaula.gof_patterns.gof_behavioral.template_method;

/**
 * @author igor shaula \
 */
public class TeamTester extends EmployeeTemplate {

    @Override
    public String reportOnTask(int taskId) {
        return "task # " + taskId + " is done by a tester";
    }
}