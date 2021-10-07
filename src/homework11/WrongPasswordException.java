package homework11;

public class WrongPasswordException extends RuntimeException {

    WrongPasswordException(String message) {
        super(message);
    }

    WrongPasswordException() {
    }
}
