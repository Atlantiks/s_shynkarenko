package homework4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter number: ");

        try {
            num = Integer.parseInt(sc.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Invalid number!");
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
