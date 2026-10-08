package flights;
import logging.AssignmentLogger;

public class BusinessClass extends Flight {
    /**
     * Constructor for the BusinessClass class, which initializes the flight with a name and a sound file path.
     */
    public BusinessClass() {
        super("Business Class", "sounds/BusinessClass.wav");
        AssignmentLogger.logConstructor(this);
    }
    
}
