package com.igor_shaula.patterns_in_pure_java.gof_behavioral.command;

/**
 * @author igor shaula \
 */
public class RoleSales implements Command {
    
    private Project project;
    
    public RoleSales(Project project) {
        this.project = project;
    }
    
    @Override
    public void execute() {
        project.findClient();
    }
}