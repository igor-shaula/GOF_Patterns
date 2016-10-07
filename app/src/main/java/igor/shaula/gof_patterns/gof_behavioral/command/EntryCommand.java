package igor.shaula.gof_patterns.gof_behavioral.command;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;

/**
 * Encapsulate a request as an object, thereby allowing for the parameterization of clients
 * with different requests, and the queuing or logging of requests.
 * It also allows for the support of undoable operations.
 *
 * @author igor shaula \
 */
public class EntryCommand {

    private AnswerFromPattern answerFromPattern;

    public EntryCommand(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    public void doTheJob(int value) {

        // arguments are inserted in constructor to enable obvious feedback for a user \
        Project project = new Project(answerFromPattern, value);

        Command roleSales = new RoleSales(project);
        Command roleDesigner = new RoleDesigner(project);
        Command roleDeveloper = new RoleDeveloper(project);
        Command roleTester = new RoleTester(project);
        Command roleDirector = new RoleDirector(project);

        Workflow workflow = new Workflow(roleSales, roleDesigner, roleDeveloper, roleTester, roleDirector);

        workflow.doSalesJob();
        workflow.doDesignersJob();
        workflow.doDevelopersJob();
        workflow.doTestersJob();
        workflow.doDirectorsJob();
    }
}