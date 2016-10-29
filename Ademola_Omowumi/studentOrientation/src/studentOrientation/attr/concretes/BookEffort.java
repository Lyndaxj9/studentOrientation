package studentOrientation.attr.concretes;

import studentOrientation.attr.EffortI;

public class BookEffort implements EffortI {
    //mando
    private int calories = 2;
    //uni
    private double modifier = calories * .5;

    public int getValue() {
        return calories;
    }

    public double getModify() {
        return modifier;
    }
}
