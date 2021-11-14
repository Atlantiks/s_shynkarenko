package homework13;

public class Customer implements Runnable {
    private Storage atm;
    private String name;

    Customer(Storage atm, String name) {
        this.atm = atm;
        this.name = name;
    }
    @Override
    public void run() {
        atm.addToCustomers(name);
        for (int i = 0; i < 100; i++) {
            int amount = (int)(Math.random() * 100);
            if (Math.random() >= 0.5) {
                atm.addMoney(amount, this.name);
            } else {
                try {
                    atm.withdrawMoney(amount,this.name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        atm.removeFromCustomers(name);
    }
}
