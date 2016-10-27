import studentOrientation.activity.OOOrientation;
import studentOrientation.activity.OOStudentOrientation;
import studentOrientation.activity.Options;
import studentOrientation.workshop.OrientationWorkshop;
import studentOrientation.workshop.StudentOWorkshop;

public class Driver {

    public static void main(String[] args) {
        OOOrientation myOrientation = new OOStudentOrientation(Options.UNIBOOKSTORE, Options.TOURFOOT, Options.DORMGAME, Options.REGCOMPLAB);

        OrientationWorkshop shop = new StudentOWorkshop();
        shop.construct(myOrientation);
    }
}
