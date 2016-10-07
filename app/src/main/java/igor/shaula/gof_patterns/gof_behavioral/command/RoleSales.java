package igor.shaula.gof_patterns.gof_behavioral.command;

/**
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
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