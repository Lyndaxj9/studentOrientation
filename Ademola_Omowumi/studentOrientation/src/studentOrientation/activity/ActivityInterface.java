package studentOrientation.activity;

/**
 * Interface for activity classes
 */
public interface ActivityInterface {
    /**
     * @return double the cost of the activity
     */
    public double getCost();

    /**
     * @return int the time in minutes the activity takes
     */
    public int getDuration();

    /**
     * @return int the effort in calories it takes to complete
     * the activity
     */
    public int getEffort();

    /**
     * @return double the carbon footprint in tonnes the activity
     * has when doing it
     */
    public double getCarbonFoot();
}
