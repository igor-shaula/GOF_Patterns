package com.igor_shaula.patterns_in_pure_java.gof_behavioral.iterator;

/**
 * @author igor shaula \
 */
public interface Iterator {

    boolean hasNext();

    Object getNext();

    // specific only for current project \
    void setPosition(int index);
}