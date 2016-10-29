package studentOrientation.attr.concretes;

import studentOrientation.attr.EffortI;

public class RegEffort implements EffortI {
    //forms
    private int calories = 3;
    //complab
    private double modifier = calories * .6;

    public int getValue() {
        return calories;
    }

    public double getModify() {
        return modifier;
    }
}
