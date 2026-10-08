package exceptions;

public class InvalidFlightOptionException extends Exception {
    /**
     * Constructor for the InvalidFlightOptionException class, which takes a message as a parameter and passes it to the superclass constructor.
     * @param message the error message
     */
    public InvalidFlightOptionException(String message) {
        super(message);
    }
}
