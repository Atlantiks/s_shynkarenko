package homework7;

public class Car {
    private String model = "Mitsubishi Gallant";
    private String initialLocation;
    private String location;
    private double fuelTankCapacity;
    private double fuelVolumeInTank;
    private double distanceCovered;
    private double consumption;
    private double moneySpent;

    public Car(String location) {
        this.initialLocation = location;
        fuelTankCapacity = Math.round(30.0 + Math.random() * 30);
        fuelVolumeInTank = fuelTankCapacity * (0.1 + Math.random() * 0.4);
        consumption = Math.round(5.0 + Math.random() * 10);
    }

    public double getFuelInTank() {
        return fuelVolumeInTank;
    }

    @Override
    public String toString() {
        return "Автомобиль" +
                " модели " + model +
                ", находится в городе " + initialLocation +
                ", объем бака: " + fuelTankCapacity + " л" +
                ", заполнен на " + String.format("%.2f",fuelVolumeInTank) + " л" +
                ", расход бензина на 100 км составляет " + consumption + " л\n";
    }

    public void fillFullTank(double fuelPrice) {
        double charged = 0;
        double refuelled = 0;

        System.out.println("Заполняем полный бак");
        refuelled = fuelTankCapacity - fuelVolumeInTank;
        charged = refuelled * fuelPrice;
        moneySpent += charged;
        fuelVolumeInTank = fuelTankCapacity;
        System.out.printf("Заправлено %.2f литров. Оплачено %.2f грн.",refuelled,charged);
    }

    public void setTripDistance(double i) {
        distanceCovered = i;
    }

    public void drive(double i, String destination) {
        distanceCovered += i;
        location = destination;
        fuelVolumeInTank -= i / 100 * consumption;
        if (fuelVolumeInTank < 0) System.out.println("Недостаточно топлива в баке для поездки в " + destination);
        else System.out.println("Едем в " + destination + ". " + i + " км ...");
    }

    public void fillTank(double liters, double fuelPrice) {
        if (fuelVolumeInTank + liters < fuelTankCapacity) {
            fuelVolumeInTank += liters;
            moneySpent += liters * fuelPrice;
        } else {
            double extraFuel = fuelVolumeInTank + liters - fuelTankCapacity;
            fillFullTank(fuelPrice);
            System.out.printf("Заправлен полный бак. %.2f л не было заправлено, недостаточно места.", extraFuel);
        }
    }

    public void printTripReport() {
        System.out.println("Поездка из города " + initialLocation + " в город " + location + " завершена. " +
                "Общая дистанция составила " + distanceCovered + " км. Стоймость поездки составила " + String.format("%.2f",moneySpent) + " грн");
    }
}
