package homework3;

public class PrintOddNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        while (i++ < 100) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        System.out.println();

        i = 0;
        do {
            if (i % 2 != 0) System.out.print(i + " ");
        } while (++i < 100);


    }
}
