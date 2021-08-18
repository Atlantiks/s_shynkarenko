package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAverageNumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> allNumbers = new ArrayList<>();
        int sum = 0;

        System.out.println("Please input numbers, separated by space: ");

        int storedValue;

        do {
            storedValue = sc.nextInt();
            allNumbers.add(storedValue);
            sum += storedValue;
        } while (sc.hasNextInt());

        sc.close();

        if (allNumbers.size() != 0) {
            System.out.print(sum / allNumbers.size());
        } else {
            System.out.println("No integers were entered. Please restart.");
        }

    }


}
