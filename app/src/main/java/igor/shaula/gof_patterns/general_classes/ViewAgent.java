package igor.shaula.gof_patterns.general_classes;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.utils.PSF;

/**
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class ViewAgent implements View.OnClickListener {

    private TextView tvResult;

    private EditText etNewData;

    private Caller mCaller;

    // implemented by calling activity \
    public interface Caller {
        void obtainFromViewAgent(String pattern, int value);
    }

    public ViewAgent(Caller caller, View rootView) {

        mCaller = caller;

        tvResult = (TextView) rootView.findViewById(R.id.tvResult);
        etNewData = (EditText) rootView.findViewById(R.id.etNewData);

        Button bTestObserver = (Button) rootView.findViewById(R.id.bTestObserver);
        bTestObserver.setOnClickListener(this);

        Button bTestChainOfResponsibility = (Button) rootView.findViewById(R.id.bTestChainOfResponsibility);
        bTestChainOfResponsibility.setOnClickListener(this);

        Button bTestCommand = (Button) rootView.findViewById(R.id.bTestCommand);
        bTestCommand.setOnClickListener(this);

        Button bTestInterpreter = (Button) rootView.findViewById(R.id.bTestInterpreter);
        bTestInterpreter.setOnClickListener(this);

        Button bTestIterator = (Button) rootView.findViewById(R.id.bTestIterator);
        bTestIterator.setOnClickListener(this);

        Button bTestMediator = (Button) rootView.findViewById(R.id.bTestMediator);
        bTestMediator.setOnClickListener(this);

        Button bTestMemento = (Button) rootView.findViewById(R.id.bTestMemento);
        bTestMemento.setOnClickListener(this);

        Button bTestState = (Button) rootView.findViewById(R.id.bTestState);
        bTestState.setOnClickListener(this);

        Button bTestStrategy = (Button) rootView.findViewById(R.id.bTestStrategy);
        bTestStrategy.setOnClickListener(this);

        Button bTestTemplateMethod = (Button) rootView.findViewById(R.id.bTestTemplateMethod);
        bTestTemplateMethod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String pattern = null;

        switch (v.getId()) {
            case R.id.bTestObserver:
                pattern = PSF.OBSERVER;
                break;
            case R.id.bTestChainOfResponsibility:
                pattern = PSF.CHAIN_OF_RESPONSIBILITY;
                break;
            case R.id.bTestCommand:
                pattern = PSF.COMMAND;
                break;
            case R.id.bTestInterpreter:
                pattern = PSF.INTERPRETER;
                break;
            case R.id.bTestIterator:
                pattern = PSF.ITERATOR;
                break;
            case R.id.bTestMediator:
                pattern = PSF.MEDIATOR;
                break;
            case R.id.bTestMemento:
                pattern = PSF.MEMENTO;
                break;
            case R.id.bTestState:
                pattern = PSF.STATE;
                break;
            case R.id.bTestStrategy:
                pattern = PSF.STRATEGY;
                break;
            case R.id.bTestTemplateMethod:
                pattern = PSF.TEMPLATE_METHOD;
                break;
        }

        Editable newData = etNewData.getText();

        int value = 0;
        try {
            value = Integer.valueOf(String.valueOf(newData));
        } catch (NumberFormatException nfe) {
            //noinspection ConstantConditions
            if (value > 0) {
                value = Integer.MAX_VALUE;
            } else {
                value = Integer.MIN_VALUE;
            }
        }
        mCaller.obtainFromViewAgent(pattern, value);

    } // end of onClick-method \\

    public void updateText(CharSequence newText) {
        tvResult.setText(newText);
    }
}