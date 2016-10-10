package igor.shaula.gof_patterns.gof_behavioral.mediator;

/**
 * @author igor shaula \
 */
public class Admin implements Sender {

    private Chat chat;

    private String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        // attention to this method - the trick is here \
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " got message: " + message);
    }
}