package homework13;

public class Storage {
    private int money;

    public Storage() {
        this.money = 0;
    }

    public Storage(int money) {
        this.money = money;
    }

    synchronized public void withdrawMoney(int money, String customerName) {
        System.out.println(customerName + " withdraws " + money +"$");
        this.money -= money;
        getRemaining();
    }

    synchronized public void addMoney(int money,  String customerName) {
        System.out.println(customerName + " adds " + money + "$");
        this.money += money;
        getRemaining();
    }

    synchronized public void getRemaining() {
        System.out.println("ATM holds " + money + "$");
    }

}
