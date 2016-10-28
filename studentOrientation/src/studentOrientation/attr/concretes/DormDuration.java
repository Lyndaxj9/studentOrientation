package studentOrientation.attr.concretes;

import studentOrientation.attr.DurationI;

public class DormDuration implements DurationI {
    private int minutes = 20;
    private double modifier = .85;

    public int getValue() {
        return minutes;
    }

    public double getModify() {
        return modifier;
    }
}
