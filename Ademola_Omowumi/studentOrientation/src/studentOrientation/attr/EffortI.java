package studentOrientation.attr;

/**
 * The interface that holds the methods to get calories values
 */
public interface EffortI {
    /**
     * @return int the main amount of calories burned per minute
     */
    public int getValue();

    /**
     * @return double the modification for the calories
     */
    public double getModify();
}
