package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int termInYears = 0;
        long initialDeposit = 0;
        long finalDeposit = 0;
        double interestRate = 0;

        do {
            System.out.println("Enter, please, amount of your money for initial deposit: ");
            try {
                finalDeposit = initialDeposit = (long) (sc.nextInt() * 100.0);
            } catch (InputMismatchException e) {
                System.out.println("\033[1;30m" + "\033[46m" + " Error, input data is not valid!" + "\u001B[0m");
                sc.next();
            }
        } while (finalDeposit == 0);

        do {
            System.out.println("Enter, please, interest rate: ");
            try {
                interestRate = sc.nextDouble();
            } catch (InputMismatchException e)  {
                System.out.println("\033[1;30m" + "\033[46m" + " Error, input data is not valid!" + "\u001B[0m");
                sc.next();
            }

        } while (interestRate == 0);

        do {
            try {
                System.out.println("Enter, please, your time term for a deposit, in years: ");
                termInYears = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\033[1;30m" + "\033[46m" + " Error, input data is not valid!" + "\u001B[0m");
                sc.next();
            }
        } while (termInYears == 0);

        sc.close();

        long income;
        double coff = (1 + interestRate);

        System.out.println("====================================");
        for (int i = 1; i <= termInYears; i++) {
            finalDeposit *= coff;
            System.out.println(finalDeposit / 100.0 + " UAH to be settled on your account after year " + i);
        }

        income = finalDeposit - initialDeposit;

        System.out.println("====================================");
        System.out.println(income / 100.0 + " UAH is your total income");
    }
}
