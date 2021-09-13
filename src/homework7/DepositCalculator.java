package homework7;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        double sum = sc.nextDouble();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        String yearsTerm = "";
        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            switch (i % 10) {
                case 1:
                    yearsTerm = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    yearsTerm = "года";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    yearsTerm = "лет";
                    break;

            }
            if (i % 100 > 10 && i % 100 < 15) {
                yearsTerm = "лет";
            }
            System.out.printf("Накопленная сумма за %d %s составила: %.2f грн\n", i, yearsTerm, sum);
            System.out.printf("Начисленные проценты в грн: %.2f\n", y);
            System.out.println("-------");
        }
    }
}
