package igor.shaula.gof_patterns.entry_points.gof_behavioral;

import com.igor_shaula.patterns_in_pure_java.AnswerFromPattern;

import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.Command;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.Project;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.RoleDesigner;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.RoleDeveloper;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.RoleDirector;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.RoleSales;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.RoleTester;
import com.igor_shaula.patterns_in_pure_java.gof_behavioral.command.Workflow;

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