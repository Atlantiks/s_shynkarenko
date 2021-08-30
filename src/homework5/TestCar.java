package homework5;

public class TestCar {
    public static void main(String[] args) {
        double[] distances = new double[3];
        int distanceOdessaKiev = 478;
        double distanceOdessaKrivoeOzero = 178.5;
        double distanceOdessaZhashkov = 328.1;
        double gasPrice = 30.97;
        double totalCost = 0.0;

        distances[0] = distanceOdessaKrivoeOzero;
        distances[1] = distanceOdessaZhashkov - distanceOdessaKrivoeOzero;
        distances[2] = distanceOdessaKiev - distanceOdessaZhashkov;

        Car mitsubishiGalant = new Car(60.0,60.0,9);


        for (int i = 0; i < 3; i++) {
            totalCost += gasPrice * mitsubishiGalant.requiredToRefillToFullCapacity();
            mitsubishiGalant.refillFuelTankToFullCapacity();
            mitsubishiGalant.fuelRetainedCoveringDistance(distances[i]);
            System.out.println("................................................");
            System.out.printf("Distance of %.2f km was covered.\n", distances[i]);
        }


        System.out.println("======================================");
        System.out.printf("%.2f UAH spent for refuelling.\n", totalCost);
        System.out.printf("%.2f l of fuel retained in a tank.", mitsubishiGalant.fuelRetainedCoveringDistance(0));

    }
}
