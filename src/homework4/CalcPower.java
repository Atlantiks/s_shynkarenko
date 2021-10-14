package homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcPower {
    public static void main(String[] args) {
        double number = 0;
        double degree = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                number = Double.parseDouble(sc.nextLine());
                degree = Double.parseDouble(sc.nextLine());
            } catch (InputMismatchException e)  {
                System.out.println("Unable to parse value. Repeat input.");
            }
        } while (number == 0);

        System.out.println(ownPowerMethod(number, degree));
        System.out.println(poweringWithRecursion(number, degree));
        System.out.println(Math.pow(number, degree));
    }

    static double ownPowerMethod(double base, double degree) {
        double result = 1;
        for (int i = 0; i < degree; i++) {
            result = result * base;
        }
        return result;
    }

    static double poweringWithRecursion(double base, double degree) {
        if (degree == 0) return 1;
        return base * poweringWithRecursion(base, degree - 1);
    }
}
