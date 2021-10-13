package homework6;

import homework6.AnimalActions.Swimmable;

public class Dog extends Domestic implements Swimmable {

    public Dog(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public String getVoice() {
        return super.getVoice() + "\nWoof\n";
    }

    @Override
    public void swim() {
        System.out.println("Dog " + this.getName() + "swims");
    }
}
