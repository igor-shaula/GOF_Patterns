package com.igor_shaula.patterns_in_pure_java.gof_behavioral.observer;

/**
 * instead of standard java.util.Observer \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public interface MyObserver {
    
    void update(int newValue);
}