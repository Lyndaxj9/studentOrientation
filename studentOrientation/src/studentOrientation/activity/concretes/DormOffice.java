package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.SelectDormInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.DormCost;

public class DormOffice implements SelectDormInterface{
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new DormCost();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public DormOffice() {
        setCost();
        log.writeMessage("CONSTRUCTOR: DormOffice() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        cost = priceGet.getValue();
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
