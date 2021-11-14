package homework13;

import java.util.HashSet;
import java.util.Set;

public class Storage {
    private int money;
    private int maxWithdrawalAllowed;
    private int maxTopUpAllowed;
    private Set<String> customersInQueue = new HashSet<>();
    private Set<String> customersHandled = new HashSet<>();

    public Storage() {
        this.money = 0;
        getRemaining();
    }

    public Storage(int initialMoney, int maxWithdrawalAllowed, int maxTopUpAllowed) {
        this.money = initialMoney;
        this.maxWithdrawalAllowed = maxWithdrawalAllowed;
        this.maxTopUpAllowed = maxTopUpAllowed;
        getRemaining();
    }

    synchronized public void withdrawMoney(int money, String customerName) throws InterruptedException {
        if (money > this.money) {
            System.out.println(customerName + " awaiting...to withdraw " + money + "$");
            customersInQueue.add(customerName);
            wait();
            withdrawMoney(money, customerName);
            return;
        }
        customersInQueue.remove(customerName);
        System.out.println(customerName + " withdraws " + money +"$");
        this.money -= money;
        getRemaining();
        notifyAll();
    }

    synchronized public void addMoney(int money,  String customerName) {
        String adjustText = customerName.equals("Top-Up Service")  ? "\u001B[33m" : "";
        System.out.println(adjustText + customerName + " adds " + money + "$" + "\u001B[0m");
        this.money += money;
        getRemaining();
        notifyAll();
    }

    synchronized public int getRemaining() {
        System.out.println("ATM now holds " + money + "$");
        return this.money;
    }

    public int getMaxTopUpAllowed() {
        return maxTopUpAllowed;
    }

    public int getMaxWithdrawalAllowed() {
        return maxWithdrawalAllowed;
    }

    synchronized public int getCustomersInQueue() {
        return customersInQueue.size();
    }

    synchronized public int getNoOfActiveCustomers() {
        return customersHandled.size();
    }

    synchronized void addToCustomers(String name) {
        this.customersHandled.add(name);
    }

    synchronized void removeFromCustomers(String name) {
        this.customersHandled.remove(name);
    }

}
