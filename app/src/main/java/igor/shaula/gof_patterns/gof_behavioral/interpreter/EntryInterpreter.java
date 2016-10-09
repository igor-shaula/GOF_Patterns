package igor.shaula.gof_patterns.gof_behavioral.interpreter;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;

/**
 * Given a language, define a representation for its grammar along with an interpreter
 * that uses the representation to interpret sentences in the language.
 *
 * @author igor shaula \
 */
public class EntryInterpreter {

    private static final String S_ANDROID = "Android";
    private static final String S_JAVA = "Java";

    private AnswerFromPattern answerFromPattern;

    public EntryInterpreter(AnswerFromPattern answerFromPattern) {
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

        answerFromPattern.onJobDone("Developer is recognized:" + "\n"
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