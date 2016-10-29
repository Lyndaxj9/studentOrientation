package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.TourInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.TourCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.TourDuration;
import studentOrientation.attr.CarbonFPI;
import studentOrientation.attr.concretes.TourCarbon;
import studentOrientation.attr.EffortI;
import studentOrientation.attr.concretes.TourEffort;

public class Tourbus implements TourInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new TourCost();
    private DurationI timeGet = new TourDuration();
    private CarbonFPI carbonGet = new TourCarbon();
    private EffortI caloriesGet = new TourEffort();

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public Tourbus() {
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: Tourbus() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        cost = ((TourCost)priceGet).getBuscost();    
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
        carbonFoot = carbonGet.getValue() + carbonGet.getModify();    
    }

    public double getCarbonFoot() {
        return carbonFoot;
    }
}
