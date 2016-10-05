package igor.shaula.gof_patterns.general_classes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.observer.EntryToObserver;

public class MainActivity extends AppCompatActivity implements ViewAgent.Caller,
        EntryToObserver.UpperLink {

    private ViewAgent mViewAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mViewAgent = new ViewAgent(this, getWindow().getDecorView());
    }

    @Override
    public void receiveNew(int value) {
        // passing this action to patterns - the first is Observer \
        EntryToObserver entryToObserver = new EntryToObserver(this);
        entryToObserver.changeToNew(value);
    }

    @Override
    public void onValueChanged(int value) {
        mViewAgent.updateText(String.valueOf(value));
    }
}