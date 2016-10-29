package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.SelectDormInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.DormCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.DormDuration;
import studentOrientation.attr.CarbonFPI;
import studentOrientation.attr.concretes.DormCarbon;
import studentOrientation.attr.EffortI;
import studentOrientation.attr.concretes.DormEffort;


public class DormGame implements SelectDormInterface{
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new DormCost();
    private DurationI timeGet = new DormDuration();
    private CarbonFPI carbonGet = new DormCarbon();
    private EffortI caloriesGet = new DormEffort();

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public DormGame() {
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: DormGame() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        double baseCost = priceGet.getValue();
        cost += baseCost + baseCost * priceGet.getModify();    
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
