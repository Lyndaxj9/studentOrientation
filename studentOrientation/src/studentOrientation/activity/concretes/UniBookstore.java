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

public class UniBookstore implements BookstoreInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new BookCost();
    private DurationI timeGet = new BookDuration();
    private CarbonFPI carbonGet = new BookCarbon();
    private EffortI caloriesGet = new BookEffort();

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public UniBookstore(){
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: UniBookstore() called.", Logger.DebugLevel.CONSTRUCTOR);
    } 

    private void setCost() {
        double baseCost = priceGet.getValue();
        cost = baseCost + baseCost*priceGet.getModify(); 
    }

    public double getCost() {
        return cost;
    }

    private void setDuration() {
        int baseDuration = timeGet.getValue();    
        double addition = baseDuration * timeGet.getModify();
        duration = (int)addition + baseDuration; 
    }

    public int getDuration() {
        return duration;
    }

    private void setEffort() {
        effort = caloriesGet.getValue() + (int)caloriesGet.getModify();
    }

    public int getEffort() {
        return effort;
    }

    private void setCarbon() {
        carbonFoot = carbonGet.getValue() + carbonGet.getModify(); 
    }

    public double getCarbonFoot() {
        return carbonFoot;
    }
}
