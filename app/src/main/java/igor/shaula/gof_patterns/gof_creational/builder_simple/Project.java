package igor.shaula.gof_patterns.gof_creational.builder_simple;

/**
 * @author igor shaula \
 */
public class Project {

    private String designerName;
    private String developerName;
    private String testerName;
    private String managerName;

    public static class Builder {

        private String designerName;
        private String developerName;
        private String testerName;
        private String managerName;

        public Builder setDesigner(String name) {
            designerName = name;
            return this;
        }

        public Builder setDeveloper(String name) {
            developerName = name;
            return this;
        }

        public Builder setTester(String name) {
            testerName = name;
            return this;
        }

        public Builder setManager(String name) {
            managerName = name;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    } // end of inner-static-Builder-class \\

    private Project(Builder builder) {
        designerName = builder.designerName;
        developerName = builder.developerName;
        testerName = builder.testerName;
        managerName = builder.managerName;
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