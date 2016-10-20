package igor.shaula.gof_patterns.gof_behavioral.visitor;

/**
 * this interface is not a part of this pattern, it only helps to inform user about pattern's work \
 *
 * @author igor shaula \
 */
public interface Feedback {

    void sendResult(String result);
}