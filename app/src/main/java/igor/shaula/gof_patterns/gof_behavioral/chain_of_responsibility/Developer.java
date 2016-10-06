package igor.shaula.gof_patterns.gof_behavioral.chain_of_responsibility;

import igor.shaula.gof_patterns.utils.L;

/**
 * contains logic for this pattern \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public abstract class Developer {

    private static final String CN = "Developer ` ";

    // unit of experience - is usually multiplied in concrete Developer realizations \
    protected static final int ONE_MONTH = 1;

    // can be junior, middle, senior \
    protected Developer otherDeveloper;

    // how many months of experience this developer has \
    abstract protected int getExperience();

    // who this developer is by his position \
    abstract protected String getRole();

    // invoked from entryPoint while preparing this pattern for the job \
    public void setNext(Developer developer) {
        this.otherDeveloper = developer;
    }

    public int findExecutorFor(Requirement requirement, int stepsOfRecursion) {
        stepsOfRecursion++;
        L.l(CN + "stepsOfRecursion = " + stepsOfRecursion);
        if (requirement.getLevel() < this.getExperience()) {
            L.l(CN + "this " + getRole() + " will do the job for " + requirement.getLevel());
        } else if (otherDeveloper != null) {
            stepsOfRecursion = otherDeveloper.findExecutorFor(requirement, stepsOfRecursion);
        } else {
            L.l(CN + "no more developers!");
        }
        return stepsOfRecursion;
    }
}