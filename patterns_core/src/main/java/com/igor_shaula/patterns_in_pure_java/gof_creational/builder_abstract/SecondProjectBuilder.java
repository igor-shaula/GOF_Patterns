package com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract;

/**
 * concrete builder realization \
 *
 * @author igor shaula \
 */
public class SecondProjectBuilder extends AbsProjectBuilder {
    
    @Override
    public SecondProjectBuilder setDesigner() {
        project.setDesignerName("designer-2");
        return this;
    }
    
    @Override
    public SecondProjectBuilder setDeveloper() {
        project.setDeveloperName("developer-2");
        return this;
    }
    
    @Override
    public SecondProjectBuilder setTester() {
        project.setTesterName("tester-2");
        return this;
    }
    
    @Override
    public SecondProjectBuilder setManager() {
        project.setManagerName("manager-2");
        return this;
    }
}