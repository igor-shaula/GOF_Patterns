package com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor;

/**
 * this is a concrete visitor's realization \
 *
 * @author igor shuala \
 */
public class VisitorSenior implements VisitorDeveloper {

    private Feedback feedback;

    public VisitorSenior(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public void workWith(TaskCode projectCode) {
        feedback.sendResult("code is written by senior");
    }

    @Override
    public void workWith(TaskTest projectTest) {
        feedback.sendResult("test is written by senior");
    }

    @Override
    public void workWith(TaskScheme projectScheme) {
        feedback.sendResult("scheme is created by senior");
    }
}