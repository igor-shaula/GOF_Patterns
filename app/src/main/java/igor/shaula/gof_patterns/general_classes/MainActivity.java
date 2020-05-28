package igor.shaula.gof_patterns.general_classes;

import android.app.Activity;
import android.os.Bundle;
import com.igor_shaula.base_utils.C;
import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;

import igor.shaula.gof_patterns.R;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofChainOfResponsibility;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofCommand;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofInterpreter;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofIterator;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofMediator;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofMemento;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofObserver;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofState;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofStrategy;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofTemplateMethod;
import igor.shaula.gof_patterns.entry_points.gof_behavioral.GofVisitor;
import igor.shaula.gof_patterns.entry_points.gof_creational.GofBuilderAbstract;
import igor.shaula.gof_patterns.entry_points.gof_creational.GofBuilderSimple;

public class MainActivity extends Activity implements
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
            
            case C.Case.CHAIN_OF_RESPONSIBILITY:
                new GofChainOfResponsibility(this).doTheJob(value);
                break;
            case C.Case.COMMAND:
                new GofCommand(this).doTheJob(value);
                break;
            case C.Case.INTERPRETER:
                new GofInterpreter(this).doTheJob(value);
                break;
            case C.Case.ITERATOR:
                new GofIterator(this).doTheJob(value);
                break;
            case C.Case.MEDIATOR:
                new GofMediator(this).doTheJob(value);
                break;
            case C.Case.MEMENTO:
                new GofMemento(this).doTheJob(value);
                break;
            case C.Case.OBSERVER:
                new GofObserver(this).doTheJob(value);
                break;
            case C.Case.STATE:
                new GofState(this).doTheJob(value);
                break;
            case C.Case.STRATEGY:
                new GofStrategy(this).doTheJob(value);
                break;
            case C.Case.TEMPLATE_METHOD:
                new GofTemplateMethod(this).doTheJob(value);
                break;
            case C.Case.VISITOR:
                new GofVisitor(this).doTheJob(value);
                break;
            case C.Case.BUILDER_SIMPLE:
                new GofBuilderSimple(this).doTheJob(value);
                break;
            case C.Case.BUILDER_ABSTRACT:
                new GofBuilderAbstract(this).doTheJob(value);
                break;
        } // end of switch-condition \\
    } // end of obtainFromViewAgent-method \\
    
    @Override
    public void onJobDone(String result) {
        mViewAgent.updateText(result);
    }
}