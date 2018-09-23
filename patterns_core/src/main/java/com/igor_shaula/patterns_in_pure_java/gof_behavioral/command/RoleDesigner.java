package com.igor_shaula.patterns_in_pure_java.gof_behavioral.command;

/**
 * @author igor shaula \
 */
public class RoleDesigner implements Command {

    private Project project;

    public RoleDesigner(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.createDesign();
    }
}