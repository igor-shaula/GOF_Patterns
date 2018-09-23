package com.igor_shaula.patterns_in_pure_java.gof_behavioral.observer;

/**
 * instead of standard java.util.Observable \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public interface MyObservable {
    
    void registerObserver(MyObserver myObserver);
    
    void removeObserver(MyObserver myObserver);
    
    void notifyObservers();
}

// TODO: 05.10.2016 make use of removeObserver-method \