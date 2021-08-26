package homework3;

import java.util.Arrays;

public class ArrayOfOdds {
    public static void main(String[] args) {
        int[] arrayOfOddNumbers = new int[10];
        int count = 0;
        int initialValue = 1;

        while (count != arrayOfOddNumbers.length) {
            arrayOfOddNumbers[count++] = initialValue;
            initialValue += 2;
        }

        System.out.println(Arrays.toString(arrayOfOddNumbers));
    }
}
