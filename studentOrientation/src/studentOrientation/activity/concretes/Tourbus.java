package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.TourInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.TourCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.TourDuration;

public class Tourbus implements TourInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new TourCost();
    private DurationI timeGet = new TourDuration();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public Tourbus() {
        setCost();
        setDuration();
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

    public int getEffort() {
        return 0; 
    }

    public int getCarbonFoot() {
        return 0;
    }
}
