package com.igor_shaula.patterns_in_pure_java.gof_behavioral.command;

import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;

/**
 * receiver class \
 *
 * @author igor shaula \
 */
public class Project {

    private AnswerFromPattern answerFromPattern;

    // amount of hours to do the job \
    private int value;

    public Project(AnswerFromPattern answerFromPattern, int value) {
        this.answerFromPattern = answerFromPattern;
        this.value = value;
    }

    // job for sales-manager \
    public void findClient() {
        answerFromPattern.onJobDone("time to found client = " + (value * 15 / 100) + "\n");
//        L.l("client found");
    }

    // job for designer \
    public void createDesign() {
        answerFromPattern.onJobDone("time to create design = " + (value * 20 / 100) + "\n");
//        L.l("design created");
    }

    // job for developer \
    public void writeCode() {
        answerFromPattern.onJobDone("time to write code = " + (value * 50 / 100) + "\n");
//        L.l("code written");
    }

    // job for tester \
    public void testRelease() {
        answerFromPattern.onJobDone("time to test release = " + (value * 10 / 100) + "\n");
//        L.l("release tested");
    }

    // job for director \
    public void divideMoney() {
        answerFromPattern.onJobDone("time to divide money = " + (value * 5 / 100) + "\n");
//        L.l("money divided");
    }
}