package igor.shaula.gof_patterns.gof_creational.builder_abstract;

/**
 * top-level abstract builder of the product \
 *
 * @author igor shaula \
 */
public abstract class AbsProjectBuilder {

    // pay attention to modifier - it's protected \
    protected Project project;

    public Project getProject() {
        return project;
    }

    public void createProject() {
        project = new Project();
    }

    abstract AbsProjectBuilder setDesigner();

    abstract AbsProjectBuilder setDeveloper();

    abstract AbsProjectBuilder setTester();

    abstract AbsProjectBuilder setManager();
}