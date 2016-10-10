package igor.shaula.gof_patterns.entry_points;

import igor.shaula.gof_patterns.general_classes.AnswerFromPattern;
import igor.shaula.gof_patterns.gof_behavioral.command.Project;
import igor.shaula.gof_patterns.gof_behavioral.command.RoleDesigner;
import igor.shaula.gof_patterns.gof_behavioral.command.RoleDeveloper;
import igor.shaula.gof_patterns.gof_behavioral.command.RoleDirector;
import igor.shaula.gof_patterns.gof_behavioral.command.RoleSales;
import igor.shaula.gof_patterns.gof_behavioral.command.RoleTester;
import igor.shaula.gof_patterns.gof_behavioral.command.Workflow;

/**
 * Encapsulate a request as an object, thereby allowing for the parameterization of clients
 * with different requests, and the queuing or logging of requests.
 * It also allows for the support of undoable operations.
 *
 * @author igor shaula \
 */
public class GofCommand {

    private AnswerFromPattern answerFromPattern;

    public GofCommand(AnswerFromPattern answerFromPattern) {
        this.answerFromPattern = answerFromPattern;
    }

    public void doTheJob(int value) {

        // arguments are inserted in constructor to enable obvious feedback for a user \
        Project project = new Project(answerFromPattern, value);

        igor.shaula.gof_patterns.gof_behavioral.command.Command roleSales = new RoleSales(project);
        igor.shaula.gof_patterns.gof_behavioral.command.Command roleDesigner = new RoleDesigner(project);
        igor.shaula.gof_patterns.gof_behavioral.command.Command roleDeveloper = new RoleDeveloper(project);
        igor.shaula.gof_patterns.gof_behavioral.command.Command roleTester = new RoleTester(project);
        igor.shaula.gof_patterns.gof_behavioral.command.Command roleDirector = new RoleDirector(project);

        Workflow workflow = new Workflow(roleSales, roleDesigner, roleDeveloper, roleTester, roleDirector);

        workflow.doSalesJob();
        workflow.doDesignersJob();
        workflow.doDevelopersJob();
        workflow.doTestersJob();
        workflow.doDirectorsJob();
    }
}