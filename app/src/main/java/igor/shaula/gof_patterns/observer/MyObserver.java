package igor.shaula.gof_patterns.observer;

/**
 * instead of standard java.util.Observer \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public interface MyObserver {

    void update(int newValue);
}