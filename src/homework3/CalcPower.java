package homework3;

public class CalcPower {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(ownPowerMethod(number, 3));
        System.out.println(poweringWithRecursion(number, 3));
        System.out.println(Math.pow(number, 3));
    }

    static double ownPowerMethod(double base, int degree) {
        double result = 1;
        for (int i = 0; i < degree; i++) {
            result = result * base;
        }
        return result;
    }

    static double poweringWithRecursion(double base, int degree) {
        if (degree == 0) return 1;
        return base * poweringWithRecursion(base, degree - 1);
    }
}
