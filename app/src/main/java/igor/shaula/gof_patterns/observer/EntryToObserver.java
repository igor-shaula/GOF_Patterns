package igor.shaula.gof_patterns.observer;

/**
 * starting point to work with this pattern \
 *
 * @author igor shaula \
 */
public class EntryToObserver {

    private ObservableObject observableObject;

    public EntryToObserver(UpperLink upperLink) {

        observableObject = new ObservableObject();

        new ObserverObject(upperLink, observableObject);
    }

    // implemented by calling activity \
    public interface UpperLink {
        void onValueChanged(int value);
    }

    // called from activity that implements inner interface \
    public void changeToNew(int value) {
        observableObject.setObservableValue(value);
    }
}