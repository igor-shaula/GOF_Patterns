package com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor;

/**
 * @author igor shaula \
 */
public class TaskVenue implements TaskForVisitor {
    
    private TaskForVisitor[] forVisitorArray;
    
    public TaskVenue() {
        this.forVisitorArray = new TaskForVisitor[]{
                new TaskCode(),
                new TaskTest(),
                new TaskScheme()
        };
    }
    
    @Override
    public void workFor(VisitorDeveloper visitorDeveloper) {
        
        for (TaskForVisitor taskForVisitor : forVisitorArray) {
            taskForVisitor.workFor(visitorDeveloper);
        }
    }
}