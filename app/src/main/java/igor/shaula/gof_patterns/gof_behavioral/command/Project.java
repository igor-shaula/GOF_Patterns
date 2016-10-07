package igor.shaula.gof_patterns.gof_behavioral.command;

import igor.shaula.gof_patterns.utils.L;

/**
 * receiver class \
 *
 * @author igor shaula \
 */
@SuppressWarnings("WeakerAccess")
public class Project {

    // job for sales-manager \
    public void findClient() {
        L.l("client found");
    }

    // job for designer \
    public void createDesign() {
        L.l("design created");
    }

    // job for developer \
    public void writeCode() {
        L.l("code written");
    }

    // job for tester \
    public void testRelease() {
        L.l("release tested");
    }

    // job for director \
    public void divideMoney() {
        L.l("money divided");
    }
}