package studentOrientation.activity;

import studentOrientation.factory.SimpleBookstoreFactory;

public class OOStudentOrientation implements OOOrientation {

    public BookstoreInterface bookstore;
    public TourInterface tour;
    public SelectDormInterface dorm;
    public RegisterInterface reg;

    private Options storeName;
    private Options transport;
    private Options selectMethod;
    private Options regPlace;

    private SimpleBookstoreFactory sbf = new SimpleBookstoreFactory();

    public int duration;
    public int cost;
    public int carbonFootprint;
    public int calories;

    public OOStudentOrientation(Options storeName_In, Options transport_In,
            Options selectMethod_In, Options regPlace_In) {
       storeName = storeName_In; 
       transport = transport_In;
       selectMethod = selectMethod_In;
       regPlace = regPlace_In;
    }

    public void chooseBookstore() {
        bookstore = sbf.createActivity(storeName);        
        System.out.println("chooseBookstore()");
    }

    public void setUpTour() {

    }

    public void selectDorm() {
        
    }

    public void registerCourses() {
        
    }
}
