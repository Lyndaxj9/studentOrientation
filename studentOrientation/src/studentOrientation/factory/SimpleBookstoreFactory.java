package studentOrientation.factory;

import studentOrientation.activity.BookstoreInterface;
import studentOrientation.activity.UniBookstore;

public class SimpleBookstoreFactory implements SimpleBookstoreFactoryI {
    private BookstoreInterface bookstore;

    public SimpleBookstoreFactory(){}

    public BookstoreInterface createActivity(BookstoreInterface.Options store) {
        System.out.println("createActivity");
        if(store == BookstoreInterface.Options.UNIBOOKSTORE) {
            bookstore = new UniBookstore();
        } else if (store == BookstoreInterface.Options.MANDOBOOKS) {
            
        }

        return bookstore;
    }
}
