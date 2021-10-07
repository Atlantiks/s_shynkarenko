package homework11;

public class WrongLoginException extends RuntimeException{

    WrongLoginException(String message) {
        super(message);
    }

    WrongLoginException() {

    }
}
