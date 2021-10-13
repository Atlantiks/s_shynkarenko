package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindAverageNum {
    public static void main(String[] args) {
        int primaryNum = 0;
        int secondaryNum = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please, enter two integer values and press \"ENTER\": ");
            try {
                primaryNum = sc.nextInt();
                secondaryNum = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Unsupported value entered. Please re-type.");
            }
        } while (primaryNum == 0 && secondaryNum == 0);

        sc.close();
        double averageNum = (primaryNum + secondaryNum) / 2.0;
        System.out.println(averageNum);
    }
}