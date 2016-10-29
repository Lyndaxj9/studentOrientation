package studentOrientation.activity;

import studentOrientation.util.Logger;
import studentOrientation.factory.SimpleActivityFactoryI;
import studentOrientation.factory.SimpleBookstoreFactory;
import studentOrientation.factory.SimpleTourFactory;
import studentOrientation.factory.SimpleDormFactory;
import studentOrientation.factory.SimpleRegisterFactory;

/**
 * The concrete class for creating a student orientation
 */
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

    private SimpleActivityFactoryI saf; 

    private int duration = 0;
    private double cost = 0;
    private double carbonFootprint = 0;
    private int calories = 0;

    /**
     * OOStudentOrientation an object with all the information
     * about the activities selected for the orientation
     * @param storeName_In the Bookstore selection
     * @param transport_In the Tour method selection
     * @param selectMethod_In the Dorm selection method selection
     * @param regPlace_In the Registration method selection
     */
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
        cost += bookstore.getCost();
        duration += bookstore.getDuration();
        calories += bookstore.getEffort() * (double)duration;
        carbonFootprint += bookstore.getCarbonFoot();
    }

    public void setUpTour() {
        saf = new SimpleTourFactory();
        tour = ((SimpleTourFactory)saf).createActivity(transport);
        log.writeMessage("BUILDER: setUpTour() called.", Logger.DebugLevel.BUILDER);
        cost += tour.getCost();
        duration += tour.getDuration();
        calories += tour.getEffort() * (double)duration;
        carbonFootprint += tour.getCarbonFoot();
    }

    public void selectDorm() {
        saf = new SimpleDormFactory();
        dorm = ((SimpleDormFactory)saf).createActivity(selectMethod);
        log.writeMessage("BUILDER: selectDorm() called.", Logger.DebugLevel.BUILDER);
        cost += dorm.getCost(); 
        duration += dorm.getDuration();
        calories += dorm.getEffort() * (double)duration;
        carbonFootprint += dorm.getCarbonFoot();
    }

    public void registerCourses() {
        saf = new SimpleRegisterFactory();
        reg = ((SimpleRegisterFactory)saf).createActivity(regPlace);
        log.writeMessage("BUILDER: registerCourses() called.", Logger.DebugLevel.BUILDER);
        cost += reg.getCost();
        duration += reg.getDuration();
        calories += reg.getEffort() * (double)duration;
        carbonFootprint += reg.getCarbonFoot();
    }

    /**
     * @return a String representation of OOStudentOrientation
     * with all of its attributes
     */
    public String toString() {
        String header = String.format("-- Your schedule --\n") + String.format("Selected: %s %s %s %s\n",storeName, transport, selectMethod, regPlace);
        String totals = String.format("Cost: $%.2f\n", cost) + String.format("Duration: %d minutes\n", duration) 
            + String.format("Effort: %d calories\n", calories) + String.format("Carbon Footprint: %.8f tonnes", carbonFootprint);
        String result = header + totals;
        return result;
    }
}
