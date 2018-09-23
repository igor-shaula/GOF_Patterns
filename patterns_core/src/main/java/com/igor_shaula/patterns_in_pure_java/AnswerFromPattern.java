package com.igor_shaula.patterns_in_pure_java;

/**
 * unified way of callback for every pattern - it avoids creation of an interface in every EntryPoint \
 *
 * @author igor shaula \
 */
public interface AnswerFromPattern {

    // the only way for a pattern to notify user about its completion and give the results of work \
    void onJobDone(String result);
}