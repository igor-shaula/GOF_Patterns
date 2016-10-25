package igor.shaula.gof_patterns.entry_points.gof_creational;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_creational.builder_abstract.AbsProjectBuilder;
import igor.shaula.gof_patterns.gof_creational.builder_abstract.Director;
import igor.shaula.gof_patterns.gof_creational.builder_abstract.FirstProjectBuilder;
import igor.shaula.gof_patterns.gof_creational.builder_abstract.Project;
import igor.shaula.gof_patterns.gof_creational.builder_abstract.SecondProjectBuilder;
import igor.shaula.gof_patterns.gof_creational.builder_abstract.ZeroProjectBuilder;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template method lets subclasses redefine certain steps of an algorithm
 * without changing the algorithm's structure.
 *
 * @author igor shaula \
 */
public class GofBuilderAbstract {

    private AnswerFromPattern answerFromPattern;

    public GofBuilderAbstract(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    // called from activity \
    public void doTheJob(int valueIn) {

        Director director = new Director();

        AbsProjectBuilder projectBuilder;

        switch (valueIn % 3) {
            case 0:
                projectBuilder = new ZeroProjectBuilder();
                break;
            case 1:
                projectBuilder = new FirstProjectBuilder();
                break;
            case 2:
                projectBuilder = new SecondProjectBuilder();
                break;
            default:
                projectBuilder = new ZeroProjectBuilder();
                break;
        }
        director.setConcreteBuilder(projectBuilder);

        director.createProjectTeam();

        Project project = director.getReadyProject();

        String result = "staff on this project:" + "\n"
                + project.getDesignerName() + "\n"
                + project.getDeveloperName() + "\n"
                + project.getTesterName() + "\n"
                + project.getManagerName() + "\n";

        answerFromPattern.onJobDone(result);
    }
}