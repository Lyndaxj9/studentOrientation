package studentOrientation.attr.concretes;

import studentOrientation.attr.CostI;

public class TourCost implements CostI {
    private double cost = 2;
    private double footcost = 0.1;
    private double buscost = cost;

    public double getValue() {
        return cost;
    }

    public double getFootcost() {
        return footcost;
    }

    public double getBuscost() {
        return buscost;
    }

    public double getModify() {
        return 1;
    }

}
