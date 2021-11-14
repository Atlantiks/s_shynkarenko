package homework13;

public class TopUpATM implements Runnable{
    private Storage atm;

    public TopUpATM(Storage atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        while (atm.getNoOfActiveCustomers() != 0) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (atm.getNoOfActiveCustomers() == 0) return;
            if (atm.getCustomersInQueue() == atm.getNoOfActiveCustomers()) {
                atm.addMoney(100, "Top-Up Service");
            }
        }
    }
}
