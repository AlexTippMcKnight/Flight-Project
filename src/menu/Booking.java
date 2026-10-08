package menu;

import flights.*;
import internationalization.*;
import exceptions.*;
import logging.*;
import java.util.*;
import menu.*;
public class Booking extends Thread {
    static ResourceBundle res;
    private Locale locale;
    /**
     * Constructor for Booking class, takes in a locale to determine the language of the program and logs the constructor call.
     * @param locale
     */
    public Booking(Locale locale){
        this.locale = locale;
        AssignmentLogger.logConstructor(this);
    }
    //Override run method to call bookFlights method with the locale provided in the constructor.
    @Override
    public void run(){
        bookFlights(locale);
    }
    /**
     * Method to book flights, takes in a locale to determine the language of the program and loops with recurssion,
     * to allow the user to book multiple flights until they choose to exit the program. 
     * Also includes error handling for invalid options and plays a sound based on the flight class selected.
     * @param locale
     */
    public static void bookFlights(Locale locale){
        AssignmentLogger.logStaticMethodEntry();
        //for recursion, re-load the resource bundle with the locale provided in the method call, to allow for language changes when booking multiple flights.
        res = res.getBundle("internationalization.ProgramResource", locale);
        Locale english = new Locale("en","GB");
        Locale french = new Locale("fr", "FR");
        //ArrayLists for options
        ArrayList<String> flightClass = new ArrayList<>();
        flightClass.add("firstClass");
        flightClass.add("businessClass");
        flightClass.add("coachClass");
        ArrayList<String> origin = new ArrayList<>();
        origin.add("dublin");
        origin.add("paris");
        origin.add("newYork");
        origin.add("japan");
        origin.add("warsaw");
        ArrayList<String> destination = new ArrayList<>();
        destination.add("dublin");
        destination.add("paris");
        destination.add("newYork");
        destination.add("japan");
        destination.add("warsaw");

        //Program Start
        //waits for logger for cleaner output
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        System.out.println(res.getString("welcome"));

        //Origin Selection
        System.out.println(res.getString("promptOrigin"));
        for(int i = 0; i < origin.size(); i++){
            System.out.printf("%d. %s ", i+1, res.getString(origin.get(i)));
        }
        System.out.println();
        int originSelected = in.nextInt();
        try{
            if(originSelected < 1 || originSelected > origin.size()){
                throw new InvalidFlightOptionException(res.getString("invalidSelection"));
            }
        } catch (InvalidFlightOptionException e) {
            System.out.println(e.getMessage());
            originSelected = in.nextInt();
            try{
                if(originSelected < 1 || originSelected > origin.size()){
                    throw new InvalidFlightOptionException(res.getString("2ndInvalidSelection"));
                }
            } catch (InvalidFlightOptionException ex) {
                System.out.println(ex.getMessage());
                originSelected = 1;
            }
        }
        //takes the origin selected and removes it from the destination options, as you cannot fly to the same place you are flying from.
        destination.remove(originSelected-1);

        //Destination Selection
        System.out.println(res.getString("promptDestination"));
        for(int i = 0; i < destination.size(); i++){
            System.out.printf("%d. %s ", i+1, res.getString(destination.get(i)));
        }
        System.out.println();
        int destinationSelected = in.nextInt();
        try{
            if(destinationSelected < 1 || destinationSelected > destination.size()){
                throw new InvalidFlightOptionException(res.getString("invalidSelection"));
            }
        } catch (InvalidFlightOptionException e) {
            System.out.println(e.getMessage());
            destinationSelected = in.nextInt();
            try{
                if(destinationSelected < 1 || destinationSelected > destination.size()){
                    throw new InvalidFlightOptionException(res.getString("2ndInvalidSelection"));
                }
            } catch (InvalidFlightOptionException ex) {
                System.out.println(ex.getMessage());
                destinationSelected = 1;
            }
        }
        //Flight Class Selection    
        System.out.println(res.getString("promptClass"));
        for(int i = 0; i < flightClass.size(); i++){
            System.out.printf("%d. %s ", i+1, res.getString(flightClass.get(i)));
        }
        System.out.println();
        int classSelected = in.nextInt();
        try{
            if(classSelected < 1 || classSelected > 3){
                throw new InvalidFlightOptionException(res.getString("invalidSelection"));
            }
        } catch (InvalidFlightOptionException e) {
            System.out.println(e.getMessage());
            classSelected = in.nextInt();
            try{
                if(classSelected < 1 || classSelected > 3){
                    throw new InvalidFlightOptionException(res.getString("2ndInvalidSelection"));
                }
            } catch (InvalidFlightOptionException ex) {
                System.out.println(ex.getMessage());
                classSelected = 1;
            }
        }
        //plays a sound based on the flight class selected, using the same name for the sound file as the flight class option.
        SoundPlayer.playSound("sounds/" + flightClass.get(classSelected-1) + ".wav");
        System.out.println();
        //Simulates booking time with a loading message and a delay, to make the program feel more realistic.
        try {
            System.out.print(res.getString("waitMessage"));
            Thread.sleep(1300);
            System.out.print(".");
            Thread.sleep(1300);
            System.out.print(".");
            Thread.sleep(1300);
            System.out.print(".");
            Thread.sleep(1100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        //Confirmation message with flight details, using the resource bundle to get the correct language for the origin, destination and flight class selected.
        System.out.println(res.getString("bookedMessage"));
        System.out.printf(res.getString("flightDetails"), res.getString(origin.get(originSelected-1)), res.getString(destination.get(destinationSelected-1)), res.getString(flightClass.get(classSelected-1)));

        System.out.println();
        System.out.println();

        //Asks the user if they want to book another flight or exit the program, with error handling for invalid options and the ability to change language for the next booking.
        System.out.println(res.getString("languagePrompt"));
        int choice = in.nextInt();
        try{
            if(choice == 1){
                bookFlights(english);
            } else if(choice == 2){
                bookFlights(french);
            } else if(choice == 3){
                System.out.println(res.getString("exitMessage"));
            } else {
                throw new InvalidFlightOptionException(res.getString("invalidSelection"));
            }
        } catch(InvalidFlightOptionException e){
            System.out.println(e.getMessage());
            choice = in.nextInt();
            try{
                if(choice == 1){
                    bookFlights(english);
                } else if(choice == 2){
                    bookFlights(french);
                } else if(choice == 3){
                    System.out.println(res.getString("exitMessage"));
                } else {
                    throw new InvalidFlightOptionException(res.getString("2ndInvalidSelection"));
                }
            } catch(InvalidFlightOptionException ex){
                System.out.println(ex.getMessage());
                bookFlights(english);
            }
        }

        AssignmentLogger.logStaticMethodExit();
    }
    /**
     * Main method to start the program, prompts the user to select a language for the program, with error handling for invalid options and defaults to English if an invalid option is selected.
     * @param args
     */
    public static void main(String args[]){
        //Locales for English and French, Scanner for user input and prompts the user to select a language for the program, with error handling for invalid options.
        Locale english = new Locale("en","GB");
        Locale french = new Locale("fr", "FR");
        Scanner in = new Scanner(System.in);
        System.out.println("Please input an integer each choice in this program!");
        System.out.println("Please select a language - 1. English 2. French");
        int choice = in.nextInt();
        
        Thread bookingThread;

        if(choice == 1){
            bookingThread = new Booking(english);
        } else if(choice == 2){
            bookingThread = new Booking(french);
        } else {
            System.out.println("Invalid choice, defaulting to English");
            bookingThread = new Booking(english);
        }
        bookingThread.start();

        AssignmentLogger.logMain();

    }
}
