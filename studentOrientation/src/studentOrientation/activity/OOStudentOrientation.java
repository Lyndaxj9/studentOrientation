package studentOrientation.activity;

import studentOrientation.factory.SimpleActivityFactory;
import studentOrientation.factory.SimpleBookstoreFactory;

public class OOStudentOrientation implements OOOrientation {

    public BookstoreInterface bookstore;
    public TourInterface tour;
    public SelectDormInterface dorm;
    public RegisterInterface reg;

    private BookstoreInterface.Options storeName;
    private TourInterface.Transport transport;
    private SelectDormInterface.Selecting selectMethod;
    private RegisterInterface.RegMethod regPlace;

    private SimpleActivityFactory saf;

    public int duration;
    public int cost;
    public int carbonFootprint;
    public int calories;

    public OOStudentOrientation(BookstoreInterface.Options storeName_In,
            TourInterface.Transport transport_In,
            SelectDormInterface.Selecting selectMethod_In,
            RegisterInterface.RegMethod regPlace_In) {
       storeName = storeName_In; 
       transport = transport_In;
       selectMethod = selectMethod_In;
       regPlace = regPlace_In;
    }

    public void chooseBookstore() {
        bookstore = ((SimpleBookstoreFactory)saf).createActivity(storeName);        
        System.out.println("chooseBookstore()");
    }

    public void setUpTour() {

    }

    public void selectDorm() {
        
    }

    public void registerCourses() {
        
    }
}
