package igor.shaula.gof_patterns.entry_points.gof_creational;

import com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract.AbsProjectBuilder;
import com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract.Director;
import com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract.FirstProjectBuilder;
import com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract.Project;
import com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract.SecondProjectBuilder;
import com.igor_shaula.patterns_in_pure_java.gof_creational.builder_abstract.ZeroProjectBuilder;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;

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