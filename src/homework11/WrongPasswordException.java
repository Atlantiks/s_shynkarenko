package homework11;

public class WrongPasswordException extends Exception {

    WrongPasswordException(String message) {
        throw new RuntimeException(message);
    }

    WrongPasswordException() {
    }
}
