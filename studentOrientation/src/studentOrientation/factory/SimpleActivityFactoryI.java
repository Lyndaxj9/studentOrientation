package studentOrientation.factory;

import studentOrientation.activity.Options;
import studentOrientation.activity.ActivityInterface;

public interface SimpleActivityFactoryI{
    public ActivityInterface createActivity(Options activity);
}
