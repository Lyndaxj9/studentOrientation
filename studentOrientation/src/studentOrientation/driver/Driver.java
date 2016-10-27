import studentOrientation.activity.OOOrientation;
import studentOrientation.activity.OOStudentOrientation;
import studentOrientation.activity.BookstoreInterface;
import studentOrientation.activity.RegisterInterface;
import studentOrientation.activity.SelectDormInterface;
import studentOrientation.activity.TourInterface;
import studentOrientation.workshop.OrientationWorkshop;
import studentOrientation.workshop.StudentOWorkshop;

public class Driver {

    public static void main(String[] args) {
        OOOrientation myOrientation = new OOStudentOrientation(BookstoreInterface.Options.UNIBOOKSTORE, TourInterface.Transport.FOOT, SelectDormInterface.Selecting.GAME, RegisterInterface.RegMethod.COMPLAB);

        OrientationWorkshop shop = new StudentOWorkshop();
        shop.construct(myOrientation);
    }
}
