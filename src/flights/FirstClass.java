package flights;

import logging.AssignmentLogger;

public class FirstClass extends Flight {
    /**
     * Constructor for the FirstClass class, which initializes the flight with a name and a sound file path.
     */
    public FirstClass() {
        super("First Class", "sounds/FirstClass.wav");
        AssignmentLogger.logConstructor(this);
    }
}
