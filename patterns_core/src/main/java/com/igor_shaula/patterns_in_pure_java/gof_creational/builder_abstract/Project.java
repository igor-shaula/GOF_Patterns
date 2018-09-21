package com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract;

/**
 * this is a product - what is made with a concrete builder \
 *
 * @author igor shaula \
 */
public class Project {

    private String designerName;
    private String developerName;
    private String testerName;
    private String managerName;

    // all setters made of package-local accessibility \

    void setDesignerName(String designerName) {
        this.designerName = designerName;
    }

    void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    void setManagerName(String managerName) {
        this.managerName = managerName;
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