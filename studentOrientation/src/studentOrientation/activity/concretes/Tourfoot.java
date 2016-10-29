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

public class Tourfoot implements TourInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new TourCost();
    private DurationI timeGet = new TourDuration();
    private CarbonFPI carbonGet = new TourCarbon();
    private EffortI caloriesGet = new TourEffort(); 

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public Tourfoot() {
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: Tourfoot() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        cost = ((TourCost)priceGet).getFootcost();    
    }

    public double getCost() {
        return cost;
    }

    private void setDuration() {
        int baseDuration = timeGet.getValue();
        double addition = timeGet.getModify() * baseDuration;
        duration = baseDuration + (int)addition;
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
        carbonFoot = carbonGet.getValue();    
    }

    public double getCarbonFoot() {
        return carbonFoot;
    }
}
