package igor.shaula.gof_patterns.general_classes;

/**
 * unified way of callback for every pattern - it avoids creation of an interface in every EntryPoint \
 *
 * @author igor shaula \
 */
public interface AnswerFromPattern {

    // the only way for a pattern to notify user about its completion and give the results of work \
    void onJobDone(String result);
}