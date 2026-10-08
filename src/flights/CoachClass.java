package flights;
import logging.AssignmentLogger;

public class CoachClass extends Flight {
    /**
    * Constructor for the CoachClass class, which initializes the flight with a name and a sound file path.
    */
    public CoachClass() {
        super("Coach Class", "sounds/CoachClass.wav");
        AssignmentLogger.logConstructor(this);
    }
    
}
