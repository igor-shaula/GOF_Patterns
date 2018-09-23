package com.igor_shaula.patterns_in_pure_java.gof_behavioral.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * kind of object to watch over - usually this can be valuable data to keep track of \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class ObservableObject implements MyObservable {
    
    private List<MyObserver> myObserverList;
    
    private int observableValue;
    
    public ObservableObject() {
        myObserverList = new LinkedList<>();
    }
    
    @Override
    public void registerObserver(MyObserver myObserver) {
        myObserverList.add(myObserver);
    }
    
    @Override
    public void removeObserver(MyObserver myObserver) {
        myObserverList.remove(myObserver);
    }
    
    @Override
    public void notifyObservers() {
        for (MyObserver myObserver : myObserverList) {
            myObserver.update(observableValue);
        }
    }
    
    public void setObservableValue(int observableValue) {
        this.observableValue = observableValue;
        // actual observable job is done here - after every observableValue change \
        notifyObservers();
    }
}