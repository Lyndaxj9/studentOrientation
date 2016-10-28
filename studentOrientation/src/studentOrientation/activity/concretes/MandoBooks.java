package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.BookstoreInterface;

public class MandoBooks implements BookstoreInterface {
    private static Logger log = Logger.getInstance();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public MandoBooks(){
        log.writeMessage("CONSTRUCTOR: MandoBooks() called.", Logger.DebugLevel.CONSTRUCTOR);
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
