package internationalization;

import logging.AssignmentLogger;

public class ProgramResource_en extends ProgramResource{
    /**
     * Returns the localized string for the given key.
     * @param key the key for which to retrieve the localized string
     * @return the localized string
     */
    public Object handleGetObject(String key){
        String returnString = "";
        
        if(key.equals("welcome")){
            returnString = "Welcome to the flight booking system";
        } else if(key.equals("promptOrigin")){
            returnString = "Please select an origin:";
        } else if(key.equals("promptDestination")){
            returnString = "Please select a destination:";
        } else if(key.equals("promptClass")){
            returnString = "Please select a class:";
        } else if(key.equals("invalidSelection")){
            returnString = "Invalid selection, please re-select a valid option, or the default option 1 will be used.";
        } else if(key.equals("bookedMessage")){
            returnString = "Thank you for booking with us!";
        } else if (key.equals("waitMessage")) {
            returnString = "Booking your flight, please wait";
        } else if(key.equals("flightDetails")){
            returnString = "Your flight from %s --> %s has been booked in %s.";
        } else if(key.equals("dublin")){
            returnString = "Dublin";
        } else if(key.equals("paris")){
            returnString = "Paris";
        } else if(key.equals("newYork")){
            returnString = "New York";
        } else if(key.equals("japan")){
            returnString = "Japan";
        } else if(key.equals("warsaw")){
            returnString = "Warsaw";
        } else if(key.equals("firstClass")){
            returnString = "First Class";
        } else if(key.equals("businessClass")){
            returnString = "Business Class";
        } else if(key.equals("coachClass")){
            returnString = "Coach Class";
        } else if(key.equals("languagePrompt")){
            returnString = "Please select a language or exit program - 1. English 2. French 3. Exit";
        } else if(key.equals("english")){
            returnString = "English";
        } else if(key.equals("french")){
            returnString = "French";
        } else if(key.equals("2ndInvalidSelection")){
            returnString = "2nd Invalid selection, option 1 will be used.";
        } else if(key.equals("exitMessage")){
            returnString = "Exiting program, thank you for booking with us!";
        }

        return returnString;
    }
}
