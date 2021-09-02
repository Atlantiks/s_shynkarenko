package homework6;

public class Dog extends Domestic {

    public Dog(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public String getVoice() {
        return super.getVoice() + "\nWoof\n";
    }
}
