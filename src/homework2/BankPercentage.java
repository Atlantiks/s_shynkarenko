package homework2;

import java.util.Scanner;

public class BankPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter, please, amount of your money for initial deposit: ");

        long initialDeposit;
        long finalDeposit = initialDeposit = (long)(sc.nextInt() * 100.0);

        System.out.println("Enter, please, interest rate: ");
        double interestRate = sc.nextDouble();

        System.out.println("Enter, please, your time term for a deposit, in years: ");
        int termInYears = sc.nextInt();
        long income;

        double coff = (1 + interestRate);

        for (int i = 1; i <= termInYears; i++) {
            finalDeposit *= coff;
            System.out.println(finalDeposit + " UAH to be settled on your account after year " + i);
        }

        income = finalDeposit - initialDeposit;

        System.out.println(income / 100.0 + " UAH is your total income");


    }
}
