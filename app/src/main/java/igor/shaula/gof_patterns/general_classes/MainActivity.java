package igor.shaula.gof_patterns.general_classes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.entry_points.GofChainOfResponsibility;
import igor.shaula.gof_patterns.entry_points.GofCommand;
import igor.shaula.gof_patterns.entry_points.GofInterpreter;
import igor.shaula.gof_patterns.entry_points.GofIterator;
import igor.shaula.gof_patterns.entry_points.GofMediator;
import igor.shaula.gof_patterns.entry_points.GofMemento;
import igor.shaula.gof_patterns.entry_points.GofObserver;
import igor.shaula.gof_patterns.entry_points.GofState;
import igor.shaula.gof_patterns.entry_points.GofStrategy;
import igor.shaula.gof_patterns.entry_points.GofTemplateMethod;
import igor.shaula.gof_patterns.utils.PSF;

public class MainActivity extends AppCompatActivity implements
        ViewAgent.Caller, AnswerFromPattern {

    private ViewAgent mViewAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mViewAgent = new ViewAgent(this, getWindow().getDecorView());
    }

    @Override
    public void obtainFromViewAgent(String pattern, int value) {
        switch (pattern) {
            case PSF.OBSERVER:
                new GofObserver(this).doTheJob(value);
                break;
            case PSF.CHAIN_OF_RESPONSIBILITY:
                new GofChainOfResponsibility(this).doTheJob(value);
                break;
            case PSF.COMMAND:
                new GofCommand(this).doTheJob(value);
                break;
            case PSF.INTERPRETER:
                new GofInterpreter(this).doTheJob(value);
                break;
            case PSF.ITERATOR:
                new GofIterator(this).doTheJob(value);
                break;
            case PSF.MEDIATOR:
                new GofMediator(this).doTheJob(value);
                break;
            case PSF.MEMENTO:
                new GofMemento(this).doTheJob(value);
                break;
            case PSF.STATE:
                new GofState(this).doTheJob(value);
                break;
            case PSF.STRATEGY:
                new GofStrategy(this).doTheJob(value);
                break;
            case PSF.TEMPLATE_METHOD:
                new GofTemplateMethod(this).doTheJob(value);
                break;
        } // end of switch-condition \\
    } // end of obtainFromViewAgent-method \\

    @Override
    public void onJobDone(String result) {
        mViewAgent.updateText(result);
    }
}