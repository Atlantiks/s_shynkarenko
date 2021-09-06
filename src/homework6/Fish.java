package homework6;

public class Fish extends Animal {

    public Fish(int age, double weight, String color) {
        super(age, weight, color);
    }

    @Override
    public String getVoice() {
        return "....\n";
    }
}
