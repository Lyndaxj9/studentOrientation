package studentOrientation.attr.concretes;

import studentOrientation.attr.CostI;

public class BookCost implements CostI {
    private double cost = 336.75;
    private double modifier = .05;

    public double getValue() {
        return cost;
    }

    public double getModify() {
        return modifier;
    }
}
