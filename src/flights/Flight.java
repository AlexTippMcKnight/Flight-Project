package flights;

import logging.AssignmentLogger;

public abstract class Flight {
    private String name;
    private String sound;
    /**
     * Constructor for the Flight class, which takes a name and a sound file path as parameters. 
     * The name is used to identify the flight class and the sound file is played when the flight class is selected in the booking process. 
     * The constructor also logs the creation of a new Flight object using the AssignmentLogger.
     * @param name
     * @param sound
     */
    public Flight(String name, String sound) {
        this.name = name;
        this.sound = sound;
        AssignmentLogger.logConstructor(this);
    }
    /**
     * Getter method for the name of the flight class, which is used in the booking process to display the selected flight class to the user.
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Getter method for the sound file path associated with the flight class, which is used to play a sound when the flight class is selected in the booking process.
     * @return
     */
    public String getSound() {
        return sound;
    }

}
