package homework11;

public class WrongLoginException extends Exception {

    WrongLoginException(String message) {
        throw new RuntimeException(message);
    }

    WrongLoginException() {

    }
}
