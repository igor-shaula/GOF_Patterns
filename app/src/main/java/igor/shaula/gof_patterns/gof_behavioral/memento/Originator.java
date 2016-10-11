package igor.shaula.gof_patterns.gof_behavioral.memento;

import igor.shaula.gof_patterns.utils.L;

/**
 * @author igor shaula \
 */
public class Originator {

    private static final String CN = "Originator ` ";

    private String currentState;

    public void setCurrentState(String state) {
        L.l(CN + "new state = " + state);
        currentState = state;
    }

    public String getCurrentState() {
        return currentState;
    }

    public Memento saveStateToMemento() {
        L.l(CN + "saving to Memento...");
        return new Memento(currentState);
    }

    public void restoreStateFrom(Memento memento) {
        L.l(CN + "restoring from state saved in Memento...");
        currentState = memento.getSavedState();
    }

    public static class Memento {

        private final String savedState;

        public Memento(String savedState) {
            this.savedState = savedState;
        }

        private String getSavedState() {
            return savedState;
        }
    }
}