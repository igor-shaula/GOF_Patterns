package com.igor_shaula.patterns_in_pure_java.gof_behavioral.interpreter;

/**
 * @author igor shaula \
 */
public class DataExpression implements Expression {
    
    private String data;
    
    public DataExpression(String data) {
        this.data = data;
    }
    
    @Override
    public boolean interpret(String data) {
        return this.data.contains(data);
    }
}