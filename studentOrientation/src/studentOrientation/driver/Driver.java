import studentOrientation.activity.OOOrientation;
import studentOrientation.util.Logger;
import studentOrientation.activity.OOStudentOrientation;
import studentOrientation.activity.Options;
import studentOrientation.workshop.OrientationWorkshop;
import studentOrientation.workshop.StudentOWorkshop;

public class Driver {

    public static void main(String[] args) {
        int debugValue = 1;

        if(args.length == 1) {
            try {
                debugValue = Integer.parseInt(args[0]);
                
                if(debugValue > 4 && debugValue < 0) {
                    debugValue = 0;
                }
            } catch(NumberFormatException e) {
                //If no cmd arg passed then give a default of 0
                //I didn't want to print the stack trace cause
                //the execption is handled for the program to
                //continue operation
                //e.printStackTrace();
                debugValue = 0;
            }
        }
        Logger log = Logger.getInstance();
        log.setDebugValue(debugValue);

        OOOrientation myOrientation = new OOStudentOrientation(Options.UNIBOOKSTORE, Options.TOURFOOT, Options.DORMGAME, Options.REGOFFICE);

        OrientationWorkshop shop = new StudentOWorkshop();
        shop.construct(myOrientation);

        System.out.println(myOrientation);
    }
}
