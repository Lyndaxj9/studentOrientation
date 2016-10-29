package studentOrientation.attr;

/**
 * This interface holds the methods to get carbon values
 */
public interface CarbonFPI {
    /**
     * @return double the main value of carbon
     */
    public double getValue();

    /**
     * @return double the extra/lower amount of carbon that can be 
     * emmitted if the activity is not at the original value
     */
    public double getModify();
}
