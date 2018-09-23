package igor.shaula.gof_patterns.general_classes;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.igor_shaula.base_utils.C;

import igor.shaula.gof_patterns.R;

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
        
        Button bTestObserver = (Button) rootView.findViewById(R.id.bTestObserver);
        bTestObserver.setOnClickListener(this);
        
        Button bTestState = (Button) rootView.findViewById(R.id.bTestState);
        bTestState.setOnClickListener(this);
        
        Button bTestStrategy = (Button) rootView.findViewById(R.id.bTestStrategy);
        bTestStrategy.setOnClickListener(this);
        
        Button bTestTemplateMethod = (Button) rootView.findViewById(R.id.bTestTemplateMethod);
        bTestTemplateMethod.setOnClickListener(this);
        
        Button bTestVisitor = (Button) rootView.findViewById(R.id.bTestVisitor);
        bTestVisitor.setOnClickListener(this);
        
        Button bTestBuilderSimple = (Button) rootView.findViewById(R.id.bTestBuilderSimple);
        bTestBuilderSimple.setOnClickListener(this);
        
        Button bTestBuilderAbstract = (Button) rootView.findViewById(R.id.bTestBuilderAbstract);
        bTestBuilderAbstract.setOnClickListener(this);
        
    } // end of ViewAgent-constructor \\
    
    @Override
    public void onClick(View v) {
        
        String pattern = null;
        
        switch (v.getId()) {
            
            case R.id.bTestChainOfResponsibility:
                pattern = C.Case.CHAIN_OF_RESPONSIBILITY;
                break;
            case R.id.bTestCommand:
                pattern = C.Case.COMMAND;
                break;
            case R.id.bTestInterpreter:
                pattern = C.Case.INTERPRETER;
                break;
            case R.id.bTestIterator:
                pattern = C.Case.ITERATOR;
                break;
            case R.id.bTestMediator:
                pattern = C.Case.MEDIATOR;
                break;
            case R.id.bTestMemento:
                pattern = C.Case.MEMENTO;
                break;
            case R.id.bTestObserver:
                pattern = C.Case.OBSERVER;
                break;
            case R.id.bTestState:
                pattern = C.Case.STATE;
                break;
            case R.id.bTestStrategy:
                pattern = C.Case.STRATEGY;
                break;
            case R.id.bTestTemplateMethod:
                pattern = C.Case.TEMPLATE_METHOD;
                break;
            case R.id.bTestVisitor:
                pattern = C.Case.VISITOR;
                break;
            case R.id.bTestBuilderSimple:
                pattern = C.Case.BUILDER_SIMPLE;
                break;
            case R.id.bTestBuilderAbstract:
                pattern = C.Case.BUILDER_ABSTRACT;
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