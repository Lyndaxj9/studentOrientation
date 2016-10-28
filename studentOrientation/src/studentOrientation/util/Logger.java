package studentOrientation.util;

public class Logger{

    private static Logger log = new Logger();

    public static Logger getInstance(){
        return log;
    }

    public static enum DebugLevel { 
        NONE, CONSTRUCTOR, FACTORY, BUILDER, WORKSHOP
    };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
        switch (levelIn) {
            case 0: debugLevel = DebugLevel.NONE; break;
            case 1: debugLevel = DebugLevel.CONSTRUCTOR; break;
            case 2: debugLevel = DebugLevel.FACTORY; break;
            case 3: debugLevel = DebugLevel.BUILDER; break;
            case 4: debugLevel = DebugLevel.WORKSHOP; break;
        }
    }

    public static void setDebugValue (DebugLevel levelIn) {
        debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String message,
            DebugLevel levelIn ) {
        if (levelIn == debugLevel)
            System.out.println(message);
    }

    /*
     * @return the string representation of Logger which is the debug
     * level
     */
    public String toString() {
        return "Debug Level is " + debugLevel;
    }
}
