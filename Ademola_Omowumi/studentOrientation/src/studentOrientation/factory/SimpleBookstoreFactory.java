package studentOrientation.factory;

import studentOrientation.activity.ActivityInterface;
import studentOrientation.util.Logger;
import studentOrientation.activity.Options;
import studentOrientation.activity.BookstoreInterface;
import studentOrientation.activity.concretes.UniBookstore;
import studentOrientation.activity.concretes.MandoBooks;

public class SimpleBookstoreFactory implements SimpleActivityFactoryI {
    private static Logger log = Logger.getInstance();

    private BookstoreInterface bookstore;

    public SimpleBookstoreFactory(){}

    public BookstoreInterface createActivity(Options activity) {
        log.writeMessage("FACTORY: Bookstore createActivity() called.", Logger.DebugLevel.FACTORY);
        if(activity == Options.UNIBOOKSTORE) {
            bookstore = new UniBookstore();
        } else if (activity == Options.MANDOBOOKS) {
            bookstore = new MandoBooks(); 
        }

        return bookstore;
    }
}
