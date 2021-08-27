package homework5;

public class TestCar {
    public static void main(String[] args) {
        double[] distances = new double[3];
        int distanceOdessaKiev = 478;
        double distanceOdessaKrivoeOzero = 178.5;
        double distanceOdessaZhashkov = 328.1;
        double gasPrice = 27.3;
        double totalCost = 0.0;

        distances[0] = distanceOdessaKrivoeOzero;
        distances[1] = distanceOdessaZhashkov - distanceOdessaKrivoeOzero;
        distances[2] = distanceOdessaKiev - distanceOdessaZhashkov;

        Car mitsubishiGalant = new Car(60.0,5,9);

        totalCost += gasPrice * mitsubishiGalant.requiredToRefillToFullCapacity();
        mitsubishiGalant.refillFuelTankToFullCapacity();

        for (int i = 0; i < 2; i++) {
            mitsubishiGalant.fuelRetainedCoveringDistance(distances[i]);
            totalCost += gasPrice * mitsubishiGalant.requiredToRefillToFullCapacity();
            mitsubishiGalant.refillFuelTankToFullCapacity();
        }
        mitsubishiGalant.fuelRetainedCoveringDistance(distances[2]);

        System.out.println("======================================");
        System.out.println(totalCost + " UAH spent for refuelling.");

        System.out.println(mitsubishiGalant.requiredToRefillToFullCapacity() + " l of fuel retained in a tank.");

    }
}
