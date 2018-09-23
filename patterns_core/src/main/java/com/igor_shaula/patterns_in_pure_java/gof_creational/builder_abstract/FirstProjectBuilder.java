package com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract;

/**
 * concrete builder realization \
 *
 * @author igor shaula \
 */
public class FirstProjectBuilder extends AbsProjectBuilder {
    
    @Override
    public FirstProjectBuilder setDesigner() {
        project.setDesignerName("designer-1");
        return this;
    }
    
    @Override
    public FirstProjectBuilder setDeveloper() {
        project.setDeveloperName("developer-1");
        return this;
    }
    
    @Override
    public FirstProjectBuilder setTester() {
        project.setTesterName("tester-1");
        return this;
    }
    
    @Override
    public FirstProjectBuilder setManager() {
        project.setManagerName("manager-1");
        return this;
    }
}