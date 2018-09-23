package com.igor_shaula.patterns_in_pure_java.gof_behavioral.visitor;

/**
 * @author igor shuala \
 */
public interface VisitorDeveloper {
    
    void workWith(TaskCode projectCode);
    
    void workWith(TaskTest projectTest);
    
    void workWith(TaskScheme projectScheme);
    
}