package com.igor_shaula.patterns_in_pure_java.gof_behavioral.chain_of_responsibility;

/**
 * @author igor shaula \
 */
public class SeniorDeveloper extends Developer {

    @Override
    protected int getExperience() {
        return ONE_MONTH * 36;
    }

    @Override
    protected String getRole() {
        return getClass().getSimpleName();
    }
}