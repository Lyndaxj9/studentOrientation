package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.RegisterInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.RegCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.RegDuration;
import studentOrientation.attr.CarbonFPI;
import studentOrientation.attr.concretes.RegCarbon;
import studentOrientation.attr.EffortI;
import studentOrientation.attr.concretes.RegEffort;

public class RegComplab implements RegisterInterface{
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new RegCost();
    private DurationI timeGet = new RegDuration();
    private CarbonFPI carbonGet = new RegCarbon();
    private EffortI caloriesGet = new RegEffort();

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public RegComplab() {
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: RegComplab() called.", Logger.DebugLevel.CONSTRUCTOR);
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
        effort = caloriesGet.getValue() - (int)caloriesGet.getModify();
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
