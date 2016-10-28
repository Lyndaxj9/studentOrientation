package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.TourInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.TourCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.TourDuration;

public class Tourfoot implements TourInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new TourCost();
    private DurationI timeGet = new TourDuration();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public Tourfoot() {
        setCost();
        setDuration();
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

    public int getEffort() {
        return 0; 
    }

    public int getCarbonFoot() {
        return 0;
    }
}
