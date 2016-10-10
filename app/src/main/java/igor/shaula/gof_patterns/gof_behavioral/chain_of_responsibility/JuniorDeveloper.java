package igor.shaula.gof_patterns.gof_behavioral.chain_of_responsibility;

/**
 * @author igor shaula \
 */
public class JuniorDeveloper extends Developer {

    @Override
    protected int getExperience() {
        return ONE_MONTH * 12;
    }

    @Override
    protected String getRole() {
        return getClass().getSimpleName();
    }
}