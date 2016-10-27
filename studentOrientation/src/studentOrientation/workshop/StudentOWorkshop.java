package studentOrientation.workshop;

import studentOrientation.activity.OOOrientation;

public class StudentOWorkshop implements OrientationWorkshop {
    public void construct(OOOrientation o) {
        o.chooseBookstore();
    }
}
