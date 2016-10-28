package studentOrientation.activity.concretes;

import studentOrientation.util.Logger;
import studentOrientation.activity.BookstoreInterface;
import studentOrientation.attr.CostI;
import studentOrientation.attr.concretes.BookCost;
import studentOrientation.attr.DurationI;
import studentOrientation.attr.concretes.BookDuration;

public class MandoBooks implements BookstoreInterface {
    private static Logger log = Logger.getInstance();
    private CostI priceGet = new BookCost();
    private DurationI timeGet = new BookDuration();

    private double cost;
    private int duration;
    private int effort;
    private int carbonFoot;

    public MandoBooks(){
        setCost();
        setDuration();
        log.writeMessage("CONSTRUCTOR: MandoBooks() called.", Logger.DebugLevel.CONSTRUCTOR);
    } 

    private void setCost() {
        cost = priceGet.getValue();    
    }

    public double getCost() {
        return cost;
    }

    private void setDuration() {
        duration = timeGet.getValue();     
    }
    
    public int getDuration() {
        return duration;
    }

    public int getEffort() {
        return 0;
    }

    public int getCarbonFoot() {
        return 0;
    }
}
