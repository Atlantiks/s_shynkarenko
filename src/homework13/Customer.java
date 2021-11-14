package homework13;

public class Customer implements Runnable {
    private final Storage atm;
    private final String name;

    Customer(Storage atm, String name) {
        this.atm = atm;
        this.name = name;
    }

    @Override
    public void run() {
        atm.addToCustomers(name);
        int i = 0;
        for (; i < 50; i++) {
            try {
                Thread.sleep((int)(Math.random() * 400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        System.out.println("\u001B[34m" + name + " has completed all (" + i + ")  bank ops." + "\u001B[0m");
        atm.removeFromCustomers(name);
    }
}
