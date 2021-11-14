package homework13;

public class Handler {
    public static void main(String[] args) {
        Storage myATM = new Storage();

        new Thread(new Customer(myATM, "Customer 1")).start();
        new Thread(new Customer(myATM, "Customer 2")).start();
        new Thread(new TopUpATM()).start();

    }
}
