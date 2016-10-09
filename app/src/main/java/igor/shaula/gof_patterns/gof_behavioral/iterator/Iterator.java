package igor.shaula.gof_patterns.gof_behavioral.iterator;

/**
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public interface Iterator {

    boolean hasNext();

    Object getNext();

    // specific only for current project \
    void setPosition(int index);
}