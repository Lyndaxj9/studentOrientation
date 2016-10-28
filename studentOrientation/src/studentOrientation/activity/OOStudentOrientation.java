package studentOrientation.activity;

import studentOrientation.util.Logger;
import studentOrientation.factory.SimpleActivityFactoryI;
import studentOrientation.factory.SimpleBookstoreFactory;
import studentOrientation.factory.SimpleTourFactory;
import studentOrientation.factory.SimpleDormFactory;
import studentOrientation.factory.SimpleRegisterFactory;

public class OOStudentOrientation implements OOOrientation {
    
    private static Logger log = Logger.getInstance();

    private BookstoreInterface bookstore;
    private TourInterface tour;
    private SelectDormInterface dorm;
    private RegisterInterface reg;

    private Options storeName;
    private Options transport;
    private Options selectMethod;
    private Options regPlace;

    private SimpleActivityFactoryI saf; //= new SimpleActivityFactoryI();

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
        saf = new SimpleBookstoreFactory();
        bookstore = ((SimpleBookstoreFactory)saf).createActivity(storeName);        
        log.writeMessage("BUILDER: chooseBookstore() called.", Logger.DebugLevel.BUILDER);
    }

    public void setUpTour() {
        saf = new SimpleTourFactory();
        tour = ((SimpleTourFactory)saf).createActivity(transport);
        log.writeMessage("BUILDER: setUpTour() called.", Logger.DebugLevel.BUILDER);
    }

    public void selectDorm() {
        saf = new SimpleDormFactory();
        dorm = ((SimpleDormFactory)saf).createActivity(selectMethod);
        log.writeMessage("BUILDER: selectDorm() called.", Logger.DebugLevel.BUILDER);
        
    }

    public void registerCourses() {
        saf = new SimpleRegisterFactory();
        reg = ((SimpleRegisterFactory)saf).createActivity(regPlace);
        log.writeMessage("BUILDER: registerCourses() called.", Logger.DebugLevel.BUILDER);
    }
}
