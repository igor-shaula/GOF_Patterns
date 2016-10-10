package igor.shaula.gof_patterns.gof_behavioral.chain_of_responsibility;

/**
 * @author igor shaula \
 */
public class Requirement {

    private int level;

    public Requirement(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}