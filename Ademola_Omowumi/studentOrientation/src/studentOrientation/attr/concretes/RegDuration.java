package studentOrientation.attr.concretes;

import studentOrientation.attr.DurationI;

public class RegDuration implements DurationI {
    //complab
    private int minutes = 10;
    //form
    private double modifier = minutes * 1.1;

    public int getValue() {
        return minutes;
    }

    public double getModify() {
        return modifier;
    }
}
