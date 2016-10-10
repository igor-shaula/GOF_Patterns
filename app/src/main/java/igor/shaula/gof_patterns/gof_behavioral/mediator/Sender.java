package igor.shaula.gof_patterns.gof_behavioral.mediator;

/**
 * @author igor shaula \
 */
public interface Sender {

    void sendMessage(String message);

    void getMessage(String message);
}