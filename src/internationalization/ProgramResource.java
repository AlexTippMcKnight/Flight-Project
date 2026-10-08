package internationalization;

import java.util.*;
import logging.AssignmentLogger;

public class ProgramResource extends ResourceBundle{
    /**
     * An array of keys for the localized strings.
     */
    private String[] keys = {
        "welcome",
        "promptOrigin",
        "promptDestination",
        "promptClass",
        "invalidSelection",
        "2ndInvalidSelection",
        "bookedMessage",
        "waitMessage",
        "flightDetails",
        "dublin",
        "paris",
        "newYork",
        "japan",
        "warsaw",
        "firstClass",
        "businessClass",
        "coachClass",
        "languagePrompt",
        "english",
        "french",
        "exitMessage"
    };
    /**
     * Returns an enumeration of the keys for the localized strings.
     * @return an enumeration of the keys
     */
    public Enumeration getKeys() {
        return Collections.enumeration(Arrays.asList(keys));
    }
    /**
     * Returns the localized string for the given key.
     * @param key the key for which to retrieve the localized string
     * @return the localized string
     */
    public Object handleGetObject(String key){ 
        return keys; 
    }
}
