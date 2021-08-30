package homework4;

public class CalcFactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);

        int i = 1;
        result = 1;
        while (i <= n) {
            result *= i++;
        }
        System.out.println(result);

        i = 1;
        result = 1;
        do {
            result *= i++;
        } while (i <= n);
        System.out.println(result);
    }
}
