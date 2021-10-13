package homework6;

import homework6.AnimalActions.Hunting;

public class Cat extends Domestic implements Hunting {

    public Cat(int age, int weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    public String getVoice() {
        return super.getVoice() + "\nMeow";
    }

    @Override
    public void chaseVictim() {
        System.out.println("Cat " + this.getName() + " was in pursuit of her victim and finally caught it!");
    }

    @Override
    public void killVictim() {
        System.out.println("Cat" + this.getName() + " enjoyed her dinner =)");
    }
}
