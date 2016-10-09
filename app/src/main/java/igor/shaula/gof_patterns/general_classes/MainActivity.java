package igor.shaula.gof_patterns.general_classes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.gof_behavioral.chain_of_responsibility.EntryChainOfResponsibility;
import igor.shaula.gof_patterns.gof_behavioral.command.EntryCommand;
import igor.shaula.gof_patterns.gof_behavioral.interpreter.EntryInterpreter;
import igor.shaula.gof_patterns.gof_behavioral.iterator.EntryIterator;
import igor.shaula.gof_patterns.gof_behavioral.observer.EntryObserver;
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
                new EntryObserver(this).doTheJob(value);
                break;
            case PSF.CHAIN_OF_RESPONSIBILITY:
                new EntryChainOfResponsibility(this).doTheJob(value);
                break;
            case PSF.COMMAND:
                new EntryCommand(this).doTheJob(value);
                break;
            case PSF.INTERPRETER:
                new EntryInterpreter(this).doTheJob(value);
                break;
            case PSF.ITERATOR:
                new EntryIterator(this).doTheJob(value);
        }
    }

    @Override
    public void onJobDone(String result) {
        mViewAgent.updateText(result);
    }
}