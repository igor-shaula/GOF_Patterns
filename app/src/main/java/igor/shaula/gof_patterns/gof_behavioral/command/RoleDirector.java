package igor.shaula.gof_patterns.gof_behavioral.command;

/**
 * @author igor shaula \
 */
public class RoleDirector implements Command {

    private Project project;

    public RoleDirector(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.divideMoney();
    }
}