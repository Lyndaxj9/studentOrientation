package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.BookstoreInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.BookCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.BookDuration;
import studentOrientation.attr.CarbonFPI;
import studentOrientation.attr.concretes.BookCarbon;
import studentOrientation.attr.EffortI;
import studentOrientation.attr.concretes.BookEffort;

public class MandoBooks implements BookstoreInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new BookCost();
    private DurationI timeGet = new BookDuration();
    private CarbonFPI carbonGet = new BookCarbon();
    private EffortI caloriesGet = new BookEffort();

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public MandoBooks(){
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: MandoBooks() called.", Logger.DebugLevel.CONSTRUCTOR);
    } 

    private void setCost() {
        cost = priceGet.getValue();    
    }

    public double getCost() {
        return cost;
    }

    private void setDuration() {
        duration = timeGet.getValue();     
    }
    
    public int getDuration() {
        return duration;
    }

    private void setEffort() {
        effort = caloriesGet.getValue();    
    }

    public int getEffort() {
        return effort;
    }

    private void setCarbon() {
        carbonFoot = carbonGet.getValue();
    }

    public double getCarbonFoot() {
        return carbonFoot;
    }
}
