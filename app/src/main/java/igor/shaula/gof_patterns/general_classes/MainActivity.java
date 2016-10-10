package igor.shaula.gof_patterns.general_classes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.entry_points.ToChainOfResponsibility;
import igor.shaula.gof_patterns.entry_points.ToCommand;
import igor.shaula.gof_patterns.entry_points.ToInterpreter;
import igor.shaula.gof_patterns.entry_points.ToIterator;
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
                new ToChainOfResponsibility(this).doTheJob(value);
                break;
            case PSF.COMMAND:
                new ToCommand(this).doTheJob(value);
                break;
            case PSF.INTERPRETER:
                new ToInterpreter(this).doTheJob(value);
                break;
            case PSF.ITERATOR:
                new ToIterator(this).doTheJob(value);
        }
    }

    @Override
    public void onJobDone(String result) {
        mViewAgent.updateText(result);
    }
}