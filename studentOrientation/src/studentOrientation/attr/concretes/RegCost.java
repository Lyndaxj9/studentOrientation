package studentOrientation.attr.concretes;

import studentOrientation.attr.CostI;

public class RegCost implements CostI {
    private double cost = 7621.46;
    private double modifier = .03;

    public double getValue() {
        return cost;
    }

    public double getModify() {
        return modifier;
    }
}
