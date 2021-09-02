package homework6;

public class Cat extends Domestic {

    public Cat(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public String getVoice() {
        return super.getVoice() + "\nMeow";
    }
}
