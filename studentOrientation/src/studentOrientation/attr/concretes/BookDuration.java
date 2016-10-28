package studentOrientation.attr.concretes;

import studentOrientation.attr.DurationI;

public class BookDuration implements DurationI {
    private int minutes = 25;
    private double modifier = .5;

    public int getValue() {
        return minutes;
    }

    public double getModify() {
        return modifier;
    }
}
