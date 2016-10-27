package studentOrientation.factory;

import studentOrientation.activity.ActivityInterface;
import studentOrientation.activity.BookstoreInterface;

public interface SimpleBookstoreFactoryI {
    public ActivityInterface createActivity(BookstoreInterface.Options name);
}
