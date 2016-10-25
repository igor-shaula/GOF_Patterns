package igor.shaula.gof_patterns.gof_creational.builder_abstract;

/**
 * @author igor shaula \
 */
public interface AbsProjectBuilder {

    AbsProjectBuilder setDesigner(String name);

    AbsProjectBuilder setDeveloper(String name);

    AbsProjectBuilder setTester(String name);

    AbsProjectBuilder setManager(String name);
}