package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.mediator.ChatRealization;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.mediator.User;

/**
 * Define an object that encapsulates how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
 * and it allows their interaction to vary independently.
 *
 * @author igor shaula \
 */
public class GofMediator {

    private AnswerFromPattern answerFromPattern;

    public GofMediator(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    public void doTheJob(int value) {

        ChatRealization chatRealization = new ChatRealization();

        User junior = new User(chatRealization, "Junior");
        User middle = new User(chatRealization, "Middle");
        User senior = new User(chatRealization, "Senior");
        User teamlead = new User(chatRealization, "TeamLead");

        chatRealization.setAdmin(teamlead);
        chatRealization.addUser(junior);
        chatRealization.addUser(middle);
        chatRealization.addUser(senior);

        String response;
        switch (value % 4) {
            case 1:
                junior.sendMessage("from junior");
                break;
            case 2:
                middle.sendMessage("from middle");
                break;
            case 3:
                senior.sendMessage("from senior");
                break;
            case 0:
                teamlead.sendMessage("from teamlead");
                break;
        }
        answerFromPattern.onJobDone("messages are sent");
    }
}