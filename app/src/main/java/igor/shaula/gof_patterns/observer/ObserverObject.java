package igor.shaula.gof_patterns.observer;

/**
 * kind of a listener for ObservableObject \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class ObserverObject implements MyObserver {

    //    private ObservableObject observableObject;
//    private EntryToObserver entryToObserver;
    private EntryToObserver.UpperLink upperLink;

    // all linking are done here - in the constructor \
    public ObserverObject(EntryToObserver.UpperLink upperLink, ObservableObject observableObject) {
//        this.observableObject = observableObject;
//        this.entryToObserver = entryToObserver;
        this.upperLink = upperLink;
        observableObject.registerObserver(this);
    }

    // is invoked from interface inside Observable - here we only receive new data \
    @Override
    public void update(int newValue) {
//        entryToObserver.changeToNew(newValue);
        upperLink.onValueChanged(newValue);
    }
}