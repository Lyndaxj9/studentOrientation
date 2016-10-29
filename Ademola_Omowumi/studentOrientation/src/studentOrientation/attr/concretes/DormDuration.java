package studentOrientation.attr.concretes;

import studentOrientation.attr.DurationI;

public class DormDuration implements DurationI {
    //game
    private int minutes = 20;
    //standline
    private double modifier = minutes * .85;

    public int getValue() {
        return minutes;
    }

    public double getModify() {
        return modifier;
    }
}
