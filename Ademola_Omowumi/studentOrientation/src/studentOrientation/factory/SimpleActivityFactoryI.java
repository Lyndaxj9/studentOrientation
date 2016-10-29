package studentOrientation.factory;

import studentOrientation.activity.Options;
import studentOrientation.activity.ActivityInterface;

/**
 * This interface if for the factories of different types of activities
 */
public interface SimpleActivityFactoryI{
    /**
     * Facilitates the creation of an activity based on the user specification
     * @return ActivityInterface a concrete activity type
     * @param activity the enum representing the users choice of activity
     */
    public ActivityInterface createActivity(Options activity);
}
