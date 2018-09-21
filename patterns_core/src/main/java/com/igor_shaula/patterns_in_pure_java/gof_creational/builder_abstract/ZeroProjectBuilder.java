package com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract;

/**
 * concrete builder realization \
 *
 * @author igor shaula \
 */
public class ZeroProjectBuilder extends AbsProjectBuilder {

    @Override
    public ZeroProjectBuilder setDesigner() {
        project.setDesignerName("designer-0");
        return this;
    }

    @Override
    public ZeroProjectBuilder setDeveloper() {
        project.setDeveloperName("developer-0");
        return this;
    }

    @Override
    public ZeroProjectBuilder setTester() {
        project.setTesterName("tester-0");
        return this;
    }

    @Override
    public ZeroProjectBuilder setManager() {
        project.setManagerName("manager-0");
        return this;
    }
}