package homework2;

import java.util.Scanner;

public class BankPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter, please, amount of your money for initial deposit: ");

        long initialDeposit;
        long finalDeposit = initialDeposit = sc.nextInt();



        double interestRate = 0.0575;

        int termInYears = 2;
        long income;

        double coff = (1 + interestRate);

        for (int i = 1; i <= termInYears; i++) {
            finalDeposit *= coff;
        }

        income = finalDeposit - initialDeposit;

        System.out.println(income / 100.0);


    }
}
