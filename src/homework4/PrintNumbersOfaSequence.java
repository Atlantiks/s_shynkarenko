package homework4;

public class PrintNumbersOfaSequence {
    public static void main(String[] args) {
        int startValue = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(startValue);
            startValue -= 5;
        }
    }
}
