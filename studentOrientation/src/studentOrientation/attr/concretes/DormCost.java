package studentOrientation.attr.concretes;

import studentOrientation.attr.CostI;

public class DormCost implements CostI {
    private double cost = 4182.94;
    private double modifier = .02;

    public double getValue() {
        return cost;
    }
    
    public double getModify() {
        return modifier;
    }
}
