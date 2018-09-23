package com.igor_shaula.patterns_in_pure_java.gof_behavioral.chain_of_responsibility;

/**
 * @author igor shaula \
 */
public class Requirement {

    private int level;

    public Requirement(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}