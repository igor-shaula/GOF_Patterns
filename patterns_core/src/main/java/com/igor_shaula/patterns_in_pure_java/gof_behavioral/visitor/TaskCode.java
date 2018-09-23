package com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor;

/**
 * @author igor shaula \
 */
public class TaskCode implements TaskForVisitor {
    
    @Override
    public void workFor(VisitorDeveloper visitorDeveloper) {
        visitorDeveloper.workWith(this);
    }
}