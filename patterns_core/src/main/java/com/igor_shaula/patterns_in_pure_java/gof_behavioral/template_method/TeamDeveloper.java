package com.igor_shaula.patterns_in_pure_java.gof_behavioral.template_method;

/**
 * @author igor shaula \
 */
public class TeamDeveloper extends EmployeeTemplate {

    @Override
    public String reportOnTask(int taskId) {
        return "task # " + taskId + " is done by a developer";
    }
}