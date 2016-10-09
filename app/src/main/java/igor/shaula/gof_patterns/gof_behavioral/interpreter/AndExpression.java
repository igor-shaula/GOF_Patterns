package igor.shaula.gof_patterns.gof_behavioral.interpreter;

/**
 * @author igor shaula \
 */
public class AndExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public AndExpression(Expression firstExpression, Expression SecondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = SecondExpression;
    }

    @Override
    public boolean interpret(String data) {
        return firstExpression.interpret(data) && secondExpression.interpret(data);
    }
}