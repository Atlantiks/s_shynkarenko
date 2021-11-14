package homework13;

public class Handler {
    public static void main(String[] args) {
        Storage myATM = new Storage(100);
        int numberOfCustomers = 2;

        for (int i = 1; i <= numberOfCustomers; i++) {
            new Thread(new Customer(myATM, "Customer " + i)).start();
        }
        new Thread(new TopUpATM(myATM)).start();

    }
}
