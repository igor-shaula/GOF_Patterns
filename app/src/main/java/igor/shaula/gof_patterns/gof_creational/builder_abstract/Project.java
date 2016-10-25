package igor.shaula.gof_patterns.gof_creational.builder_abstract;

/**
 * @author igor shaula \
 */
public class Project {

    private String designerName;
    private String developerName;
    private String testerName;
    private String managerName;

    public static class ProjectBuilder implements AbsProjectBuilder {

        private String designerName;
        private String developerName;
        private String testerName;
        private String managerName;

        @Override
        public ProjectBuilder setDesigner(String name) {
            designerName = name;
            return this;
        }

        @Override
        public ProjectBuilder setDeveloper(String name) {
            developerName = name;
            return this;
        }

        @Override
        public ProjectBuilder setTester(String name) {
            testerName = name;
            return this;
        }

        @Override
        public ProjectBuilder setManager(String name) {
            managerName = name;
            return this;
        }

        public Project build() {
            return new Project(this);
        }

    } // end of inner-static-Builder-class \\

    private Project(ProjectBuilder projectBuilder) {
        designerName = projectBuilder.designerName;
        developerName = projectBuilder.developerName;
        testerName = projectBuilder.testerName;
        managerName = projectBuilder.managerName;
    }

    public String getDesignerName() {
        return designerName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public String getTesterName() {
        return testerName;
    }

    public String getManagerName() {
        return managerName;
    }
}