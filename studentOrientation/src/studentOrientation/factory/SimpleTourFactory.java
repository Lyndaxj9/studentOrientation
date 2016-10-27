package studentOrientation.factory;

import studentOrientation.activity.ActivityInterface;
import studentOrientation.activity.Options;
import studentOrientation.activity.TourInterface;

public class SimpleTourFactory implements SimpleActivityFactoryI {
    private TourInterface tour;

    public SimpleTourFactory(){}

    public TourInterface createActivity(Options activity) {
        System.out.println("createActivity()");
        if(activity == Options.TOURBUS) {
            //tour = new
        } else if (activity == Options.TOURFOOT) {
            
        }

        return tour;
    }
}
