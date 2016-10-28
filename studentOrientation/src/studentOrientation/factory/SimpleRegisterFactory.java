package studentOrientation.factory;

import studentOrientation.util.Logger;
import studentOrientation.activity.ActivityInterface;
import studentOrientation.activity.Options;
import studentOrientation.activity.RegisterInterface;
import studentOrientation.activity.concretes.RegOffice;
import studentOrientation.activity.concretes.RegComplab;

public class SimpleRegisterFactory implements SimpleActivityFactoryI {
    private static Logger log = Logger.getInstance();

    private RegisterInterface register;

    public SimpleRegisterFactory(){}

    public RegisterInterface createActivity(Options activity) {
        log.writeMessage("FACTORY: Register createActivity() called.", Logger.DebugLevel.FACTORY);
        if(activity == Options.REGOFFICE) {
            register = new RegOffice();
        } else if (activity == Options.REGCOMPLAB) {
            register = new RegComplab(); 
        }

        return register;
    }
}
