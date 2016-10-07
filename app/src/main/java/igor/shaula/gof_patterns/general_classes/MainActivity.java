package igor.shaula.gof_patterns.general_classes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.gof_behavioral.chain_of_responsibility.EntryChainOfResponsibility;
import igor.shaula.gof_patterns.gof_behavioral.command.EntryCommand;
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
    public void receiveNew(String pattern, int value) {
        switch (pattern) {
            case PSF.OBSERVER:
                EntryObserver entryObserver = new EntryObserver(this);
                entryObserver.doTheJob(value);
                break;
            case PSF.CHAIN_OF_RESPONSIBILITY:
                EntryChainOfResponsibility entryChainOfResponsibility =
                        new EntryChainOfResponsibility(this);
                entryChainOfResponsibility.doTheJob(value);
                break;
            case PSF.COMMAND:
                EntryCommand entryCommand = new EntryCommand(this);
                entryCommand.doTheJob(value);
        }
    }

    @Override
    public void onJobDone(String result) {
        mViewAgent.updateText(result);
    }
}