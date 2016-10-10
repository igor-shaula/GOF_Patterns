package igor.shaula.gof_patterns.gof_behavioral.mediator;

/**
 * @author igor shaula \
 */
public interface Chat {

    void sendMessage(String message, Sender sender);
}