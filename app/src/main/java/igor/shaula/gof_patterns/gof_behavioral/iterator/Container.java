package igor.shaula.gof_patterns.gof_behavioral.iterator;

/**
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class Container implements Iterable {

//    private int currentLevel;

    private String[] wayForward = {"Trainee", "Junior", "Middle", "Senior", "TeamLead", "Architect"};

    // made private inner class because only outer class uses it \
    private class ContainerIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < wayForward.length;
        }

        @Override
        public Object getNext() {
            return wayForward[index++]; // first return, then increment \
        }

        @Override
        public void setPosition(int index) {
            this.index = index;
        }

    } // end of ContainerIterator-class \\

/*
    public Container(int value) {
        currentLevel = value;
    }
*/

    @Override
    public Iterator getIterator() {
        return new ContainerIterator();
    }
}