package com.igor_shaula.patterns_in_pure_java.gof_behavioral.command;

/**
 * @author igor shaula \
 */
public class RoleDeveloper implements Command {
    
    private Project project;
    
    public RoleDeveloper(Project project) {
        this.project = project;
    }
    
    @Override
    public void execute() {
        project.writeCode();
    }
}