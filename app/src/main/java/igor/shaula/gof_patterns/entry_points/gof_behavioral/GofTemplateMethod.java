package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.template_method.EmployeeTemplate;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.template_method.TeamDeveloper;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.template_method.TeamTester;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template method lets subclasses redefine certain steps of an algorithm
 * without changing the algorithm's structure.
 *
 * @author igor shaula \
 */
public class GofTemplateMethod {
    
    private AnswerFromPattern answerFromPattern;
    
    public GofTemplateMethod(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }
    
    // called from activity \
    public void doTheJob(int valueIn) {
        
        EmployeeTemplate aDeveloper = new TeamDeveloper();
        EmployeeTemplate aTester = new TeamTester();
        
        String result = aDeveloper.reportOnTask(valueIn)
                + " & " + aTester.reportOnTask(valueIn);
        
        answerFromPattern.onJobDone(result);
    }
}