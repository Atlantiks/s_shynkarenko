package homework10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List myList = new ArrayList<Integer>();

        measureListPerformance(myList);

        myList = new LinkedList<Integer>();

        measureListPerformance(myList);

    }

    public static void measureListPerformance(List<Integer> inputList) {
        long startTime, stopTime;

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000_000; i++) {
            inputList.add((int)(Math.random() * 100));
        }
        for (int i = 0; i < 100_000; i++) {
            System.out.println("Element # " + i + " = " + inputList.get((int)(Math.random() * 1000_000)));
        }

        stopTime = System.currentTimeMillis();

        System.out.println("Execution time: " + (stopTime - startTime));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
