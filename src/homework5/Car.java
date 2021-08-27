package homework5;

public class Car {
    private double fuelTankVolume;
    private double fuelTankResidue;
    private double consumptionPer100km;

    public Car (double tankVolume, double tankResidue, double consumption) {
        fuelTankVolume = tankVolume;
        fuelTankResidue = tankResidue;
        consumptionPer100km = consumption;
    }

    public void refillFuelTankToFullCapacity () {
        double volumeRefilled = fuelTankVolume - fuelTankResidue;
        System.out.println(volumeRefilled + " l of gas filled into a fuel tank.\nTank has been refilled to 100% capacity.");
        fuelTankResidue = fuelTankVolume;
    }

    public double fuelRetainedCoveringDistance (double distance) {
        System.out.println("Distance of " + distance + " km was covered.");
        fuelTankResidue -=  consumptionPer100km / 100 * distance;
        return fuelTankResidue;
    }

    public double requiredToRefillToFullCapacity () {
        return fuelTankVolume - fuelTankResidue;
    }


}
