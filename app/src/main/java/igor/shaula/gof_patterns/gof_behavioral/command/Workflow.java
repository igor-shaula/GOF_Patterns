package igor.shaula.gof_patterns.gof_behavioral.command;

/**
 * invoker class \
 *
 * @author igor shaula \
 */
public class Workflow {

    private Command jobForSales;
    private Command jobForDesigner;
    private Command jobForDeveloper;
    private Command jobForTester;
    private Command jobForDirector;

    public Workflow(Command jobForSales,
                    Command jobForDesigner,
                    Command jobForDeveloper,
                    Command jobForTester,
                    Command jobForDirector
    ) {
        this.jobForSales = jobForSales;
        this.jobForDesigner = jobForDesigner;
        this.jobForDeveloper = jobForDeveloper;
        this.jobForTester = jobForTester;
        this.jobForDirector = jobForDirector;
    }

    public void doSalesJob() {
        jobForSales.execute();
    }

    public void doDesignersJob() {
        jobForDesigner.execute();
    }

    public void doDevelopersJob() {
        jobForDeveloper.execute();
    }

    public void doTestersJob() {
        jobForTester.execute();
    }

    public void doDirectorsJob() {
        jobForDirector.execute();
    }
}