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
            if (Math.random() >= 0.5) {
                int amount = 1 + (int)(Math.random() * atm.getMaxTopUpAllowed());
                atm.addMoney(amount, this.name);
            } else {
                try {
                    int amount = 1 + (int)(Math.random() * atm.getMaxWithdrawalAllowed());
                    atm.withdrawMoney(amount,this.name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        atm.removeFromCustomers(name);
    }
}
