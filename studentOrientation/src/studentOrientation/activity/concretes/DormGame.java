package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.SelectDormInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.DormCost;

public class DormGame implements SelectDormInterface{
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new DormCost();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public DormGame() {
        setCost();
        log.writeMessage("CONSTRUCTOR: DormGame() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        double baseCost = priceGet.getValue();
        cost += baseCost + baseCost * priceGet.getModify();    
    }

    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return 0; 
    }

    public int getEffort() {
        return 0; 
    }

    public int getCarbonFoot() {
        return 0;
    }
}
