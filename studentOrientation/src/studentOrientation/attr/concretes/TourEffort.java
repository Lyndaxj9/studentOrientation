package studentOrientation.attr.concretes;

import studentOrientation.attr.EffortI;

public class TourEffort implements EffortI {
    //bus
    private int calories = 2;
    //walk
    private double modifier = calories * 2;

    public int getValue() {
        return calories;
    }

    public double getModify() {
        return modifier;
    }
}
