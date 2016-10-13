package igor.shaula.gof_patterns.entry_points;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_behavioral.strategy.ActionCoding;
import igor.shaula.gof_patterns.gof_behavioral.strategy.ActionEating;
import igor.shaula.gof_patterns.gof_behavioral.strategy.ActionMoving;
import igor.shaula.gof_patterns.gof_behavioral.strategy.ActionResting;
import igor.shaula.gof_patterns.gof_behavioral.strategy.ActionSleeping;
import igor.shaula.gof_patterns.gof_behavioral.strategy.ActionTraining;
import igor.shaula.gof_patterns.gof_behavioral.strategy.StrategyDeveloper;

/**
 * Allow an object to alter its behavior when its internal state changes.
 * The object will appear to change its class.
 *
 * @author igor shaula \
 */
public class GofStrategy {

    private AnswerFromPattern answerFromPattern;

    public GofStrategy(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    // called from activity \
    public void doTheJob(int valueIn) {

        StrategyDeveloper strategyDeveloper = new StrategyDeveloper();

        switch (valueIn % 6) {

            case 0:
                strategyDeveloper.setStrategyAction(new ActionSleeping());
                break;
            case 1:
                strategyDeveloper.setStrategyAction(new ActionMoving());
                break;
            case 2:
                strategyDeveloper.setStrategyAction(new ActionCoding());
                break;
            case 3:
                strategyDeveloper.setStrategyAction(new ActionEating());
                break;
            case 4:
                strategyDeveloper.setStrategyAction(new ActionResting());
                break;
            case 5:
                strategyDeveloper.setStrategyAction(new ActionTraining());
                break;
        }
        strategyDeveloper.executeAction();

        answerFromPattern.onJobDone("strategy selected and temporarily shown in log");
    }
}