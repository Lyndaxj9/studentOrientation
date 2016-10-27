package studentOrientation.factory;

import studentOrientation.activity.ActivityInterface;

public interface SimpleActivityFactoryI{
    public ActivityInterface createActivity(ActivityInterface.Options store);
}
