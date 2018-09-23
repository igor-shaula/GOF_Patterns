package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.chain_of_responsibility.JuniorDeveloper;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.chain_of_responsibility.MiddleDeveloper;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.chain_of_responsibility.Requirement;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.chain_of_responsibility.SeniorDeveloper;

/**
 * Avoid coupling the sender of a request to its receiver
 * by giving more than one object a chance to handle the request.
 * Chain the receiving objects and pass the request along the chain until an object handles it.
 *
 * @author igor shaula \
 */
public class GofChainOfResponsibility {
    
    private AnswerFromPattern answerFromPattern;
    
    public GofChainOfResponsibility(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }
    
    public void doTheJob(int value) {
        
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        
        juniorDeveloper.setNext(middleDeveloper);
        middleDeveloper.setNext(seniorDeveloper);
        
        Requirement requirement = new Requirement(value);
        int stepsOfRecursion = juniorDeveloper.findExecutorFor(requirement, 0);
        
        String result;
        switch (stepsOfRecursion) {
            case 1:
                result = "this job is for junior developer";
                break;
            case 2:
                result = "this job is for middle developer";
                break;
            case 3:
                result = "this job is for senior developer";
                break;
            default:
                result = "this job requires too much experience";
        }
        answerFromPattern.onJobDone(result);
    }
}