package homework6;

import homework6.AnimalActions.Hunting;
import homework6.AnimalActions.Swimmable;

public class Lion extends Wild implements Swimmable, Hunting {
    public Lion(int age, int weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public void swim() {
        System.out.println("Lions swim when its necessary... But don't push them to do so");
    }

    @Override
    public void chaseVictim() {
        System.out.println("Lions are not in rush... But they catch fast enough, though");
    }

    @Override
    public void killVictim() {
        System.out.println("Another lion has just devastated another victim...");
    }
}
