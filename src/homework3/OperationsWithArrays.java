package homework3;

import java.util.Arrays;

public class OperationsWithArrays {
    public static void main(String[] args) {
        int[] initialArray = {0,1,-2,3,4,-2};
        System.out.println("Initial array: " + Arrays.toString(initialArray));
        swapLowAndHighValues(initialArray);
        System.out.println("Average number of array is: " + findAverageOfArray(initialArray));
    }

    public static int findLowestArrayValue(int[] array) {
        int lowestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowestValue) {
                lowestValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == lowestValue) {
                System.out.println("Lowest value is: " + lowestValue + " Located at index: " + i);
            }
        }
        return lowestValue;
    }

    public static int findHighestArrayValue(int[] array) {
        int highestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highestValue) {
                highestValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == highestValue) {
                System.out.println("Highest value is: " + highestValue + " Located at index: " + i);
            }
        }
        return highestValue;
    }

    public static void swapLowAndHighValues (int[] array) {
        int lowestValue = findLowestArrayValue(array);
        int highestValue = findHighestArrayValue(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == highestValue) {
                array[i] = lowestValue;
                continue;
            }
            if (array[i] == lowestValue) {
                array[i] = highestValue;
            }
        }

        System.out.println("Modified array: " + Arrays.toString(array));
    }

    public static double findAverageOfArray(int[] array) {
        double sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum / array.length;
    }
}
