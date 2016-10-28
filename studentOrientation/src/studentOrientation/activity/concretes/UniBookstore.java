package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.BookstoreInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.BookCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.BookDuration;

public class UniBookstore implements BookstoreInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new BookCost();
    private DurationI timeGet = new BookDuration();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public UniBookstore(){
        setCost();
        setDuration();
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

    public int getEffort() {
        return 0;
    }

    public int getCarbonFoot() {
        return 0;
    }
}
