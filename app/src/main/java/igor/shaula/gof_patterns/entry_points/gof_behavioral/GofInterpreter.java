package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.interpreter.AndExpression;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.interpreter.DataExpression;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.interpreter.Expression;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.interpreter.OrExpression;

/**
 * Given a language, define a representation for its grammar along with an interpreter
 * that uses the representation to interpret sentences in the language.
 *
 * @author igor shaula \
 */
public class GofInterpreter {
    
    private static final String S_ANDROID = "Android";
    private static final String S_JAVA = "Java";
    
    private AnswerFromPattern answerFromPattern;
    
    public GofInterpreter(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }
    
    public void doTheJob(int value) {
        
        // preparing data for translation \
        String data = "candidate knows: ";
        switch (value) {
            case 0:
                data = data.concat(S_ANDROID);
                break;
            case 1:
                data = data.concat(S_JAVA);
                break;
        }
        System.out.println("data = " + data);
        
        Expression isAndroidDev = getAndroidExpression();
        Expression isJavaDev = getJavaExpression();
        
        answerFromPattern.onJobDone("StateDeveloper is recognized:" + "\n"
                + "AndroidDev = " + isAndroidDev.interpret(data) + "\n"
                + "JavaDev = " + isJavaDev.interpret(data));
    }
    
    private Expression getAndroidExpression() {
        
        Expression androidDev = new DataExpression(S_ANDROID);
        Expression javaDev = new DataExpression(S_JAVA);
        
        return new AndExpression(androidDev, javaDev);
    }
    
    private Expression getJavaExpression() {
        
        Expression androidDev = new DataExpression(S_ANDROID);
        Expression javaDev = new DataExpression(S_JAVA);
        
        return new OrExpression(androidDev, javaDev);
    }
}