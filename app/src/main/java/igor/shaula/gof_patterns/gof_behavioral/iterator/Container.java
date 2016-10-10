package igor.shaula.gof_patterns.gof_behavioral.iterator;

/**
 * @author igor shaula \
 */
public class Container implements Iterable {

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
    }

    @Override
    public Iterator getIterator() {
        return new ContainerIterator();
    }
}