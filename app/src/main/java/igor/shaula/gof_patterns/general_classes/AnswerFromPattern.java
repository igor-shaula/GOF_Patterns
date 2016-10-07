package igor.shaula.gof_patterns.general_classes;

/**
 * unified way of callback for every pattern - it avoids creation of an interface in every EntryPoint \
 *
 * @author igor shaula \
 */
public interface AnswerFromPattern {
    void onJobDone(String result);
}