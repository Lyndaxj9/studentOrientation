package studentOrientation.factory;

import studentOrientation.util.Logger;
import studentOrientation.activity.ActivityInterface;
import studentOrientation.activity.Options;
import studentOrientation.activity.TourInterface;
import studentOrientation.activity.concretes.Tourbus;
import studentOrientation.activity.concretes.Tourfoot;

public class SimpleTourFactory implements SimpleActivityFactoryI {
    private static Logger log = Logger.getInstance();

    private TourInterface tour;

    public SimpleTourFactory(){}

    public TourInterface createActivity(Options activity) {
        log.writeMessage("FACTORY: Tour createActivity() called.", Logger.DebugLevel.FACTORY);
        if(activity == Options.TOURBUS) {
            tour = new Tourbus();
        } else if (activity == Options.TOURFOOT) {
            tour = new Tourfoot(); 
        }

        return tour;
    }
}
