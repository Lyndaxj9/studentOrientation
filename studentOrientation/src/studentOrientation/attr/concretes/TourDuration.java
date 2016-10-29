package studentOrientation.attr.concretes;

import studentOrientation.attr.DurationI;

public class TourDuration implements DurationI {
    private int minutes = 11;
    private double modifier = 1.1;

    public int getValue() {
        return minutes;
    }

    public double getModify() {
        return modifier;
    }
}
