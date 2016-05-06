package myException;

public class NewException extends RuntimeException{
    public NewException(String message) {
        super(message);
    }

    public NewException(String message, RuntimeException e) {
        super(message, e);
    }
}
