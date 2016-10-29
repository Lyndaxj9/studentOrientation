package studentOrientation.attr.concretes;

import studentOrientation.attr.EffortI;

public class DormEffort implements EffortI {
    //game
    private int calories = 2;
    //standline
    private double modifier = calories * 1.8;

    public int getValue() {
        return calories;
    }

    public double getModify() {
        return modifier;
    }
}
