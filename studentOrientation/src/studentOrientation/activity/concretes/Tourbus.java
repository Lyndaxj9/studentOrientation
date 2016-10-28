package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.TourInterface;

public class Tourbus implements TourInterface {
    private static Logger log = Logger.getInstance();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public Tourbus() {
        log.writeMessage("CONSTRUCTOR: Tourbus() called.", Logger.DebugLevel.CONSTRUCTOR);
    }

    public double getCost() {
        return 0;
    }

    public int getDuration() {
        return 0; 
    }

    public int getEffort() {
        return 0; 
    }

    public int getCarbonFoot() {
        return 0;
    }
}
