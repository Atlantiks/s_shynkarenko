package homework2;

import java.util.Scanner;

public class FindAverageNum {
    public static void main(String[] args) {
        int primaryNum, secondaryNum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter two integer values: ");

        primaryNum = sc.nextInt();
        secondaryNum = sc.nextInt();

        sc.close();

        double averageNum = (primaryNum + secondaryNum) / 2.0;

        System.out.println(averageNum);
    }
}