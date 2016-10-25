package igor.shaula.gof_patterns.entry_points.gof_creational;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_creational.builder_simple.Project;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template method lets subclasses redefine certain steps of an algorithm
 * without changing the algorithm's structure.
 *
 * @author igor shaula \
 */
public class GofBuilderSimple {

    private AnswerFromPattern answerFromPattern;

    public GofBuilderSimple(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    // called from activity \
    public void doTheJob(int valueIn) {

        String designer = null;
        String developer = null;
        String tester = null;
        String manager = null;

        switch (valueIn % 3) {
            case 0:
                designer = "designer-0";
                developer = "developer-0";
                tester = "tester-0";
                manager = "manager-0";
                break;
            case 1:
                designer = "designer-1";
                developer = "developer-1";
                tester = "tester-1";
                manager = "manager-1";
                break;
            case 2:
                designer = "designer-2";
                developer = "developer-2";
                tester = "tester-2";
                manager = "manager-2";
                break;
        }

        Project project = new Project.Builder()
                .setDesigner(designer)
                .setDeveloper(developer)
                .setTester(tester)
                .setManager(manager)
                .build();

        String result = "staff on this project:" + "\n"
                + project.getDesignerName() + "\n"
                + project.getDeveloperName() + "\n"
                + project.getTesterName() + "\n"
                + project.getManagerName() + "\n";

        answerFromPattern.onJobDone(result);
    }
}