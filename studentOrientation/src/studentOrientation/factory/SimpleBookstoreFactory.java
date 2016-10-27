package studentOrientation.factory;

import studentOrientation.activity.ActivityInterface;
import studentOrientation.activity.Options;
import studentOrientation.activity.BookstoreInterface;
import studentOrientation.activity.UniBookstore;

public class SimpleBookstoreFactory implements SimpleActivityFactoryI {
    private BookstoreInterface bookstore;

    public SimpleBookstoreFactory(){}

    public BookstoreInterface createActivity(Options activity) {
        System.out.println("createActivity()");
        if(activity == Options.UNIBOOKSTORE) {
            bookstore = new UniBookstore();
        } else if (activity == Options.MANDOBOOKS) {
            
        }

        return bookstore;
    }
}
