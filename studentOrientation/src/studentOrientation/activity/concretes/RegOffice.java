package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.RegisterInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.RegCost;

public class RegOffice implements RegisterInterface{
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new RegCost();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public RegOffice() {
        setCost();
        log.writeMessage("CONSTRUCTOR: RegOffice() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    private void setCost() {
        double baseCost = priceGet.getValue();
        cost = baseCost - baseCost*priceGet.getModify();
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
