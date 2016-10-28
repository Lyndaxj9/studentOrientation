package studentOrientation.workshop;

import studentOrientation.util.Logger;
import studentOrientation.activity.OOOrientation;

public class StudentOWorkshop implements OrientationWorkshop {
    private static Logger log = Logger.getInstance();

    public void construct(OOOrientation o) {
        log.writeMessage("WORKSHOP: construct() called.", Logger.DebugLevel.WORKSHOP);

        o.chooseBookstore();
        o.setUpTour();
        o.selectDorm();
        o.registerCourses();
    }
}
