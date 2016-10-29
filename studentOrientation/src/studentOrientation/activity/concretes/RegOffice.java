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

public class RegOffice implements RegisterInterface{
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new RegCost();
    private DurationI timeGet = new RegDuration();
    private CarbonFPI carbonGet = new RegCarbon();
    private EffortI caloriesGet = new RegEffort();

    private double cost;
    private int duration;
    private int effort;
    private double carbonFoot;

    public RegOffice() {
        setCost();
        setDuration();
        setEffort();
        setCarbon();
        log.writeMessage("CONSTRUCTOR: RegOffice() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        double baseCost = priceGet.getValue();
        cost = baseCost - baseCost*priceGet.getModify();
    }
    public double getCost() {
        return cost;
    }

    private void setDuration() {
        duration = timeGet.getValue() + (int)timeGet.getModify();    
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
