package studentOrientation.factory;

import studentOrientation.util.Logger;
import studentOrientation.activity.ActivityInterface;
import studentOrientation.activity.Options;
import studentOrientation.activity.SelectDormInterface;
import studentOrientation.activity.concretes.DormOffice;
import studentOrientation.activity.concretes.DormGame;

public class SimpleDormFactory implements SimpleActivityFactoryI {
    private static Logger log = Logger.getInstance();

    private SelectDormInterface dormSelect;

    public SimpleDormFactory(){}

    public SelectDormInterface createActivity(Options activity) {
        log.writeMessage("FACTORY: SelectDorm createActivity() called.", Logger.DebugLevel.FACTORY);
        if(activity == Options.DORMOFFICE) {
            dormSelect = new DormOffice();
        } else if (activity == Options.DORMGAME) {
            dormSelect = new DormGame(); 
        }

        return dormSelect;
    }
}
