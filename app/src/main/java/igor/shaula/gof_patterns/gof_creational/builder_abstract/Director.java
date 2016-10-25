package igor.shaula.gof_patterns.gof_creational.builder_abstract;

/**
 * @author igor shaula \
 */
public class Director {

    private AbsProjectBuilder absProjectBuilder;

    public void setConcreteBuilder(AbsProjectBuilder absProjectBuilder) {
        this.absProjectBuilder = absProjectBuilder;
    }

    public void createProjectTeam() {
        absProjectBuilder.createProject();
        absProjectBuilder.setDesigner();
        absProjectBuilder.setDeveloper();
        absProjectBuilder.setTester();
        absProjectBuilder.setManager();
    }

    public Project getReadyProject() {
        return absProjectBuilder.getProject();
    }
}