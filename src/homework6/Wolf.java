package homework6;

import homework6.AnimalActions.Hunting;

public class Wolf extends Wild implements Hunting {
    public Wolf(int age, int weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public void chaseVictim() {
        System.out.println("Wolves are fast and furious... and good for hunting");
    }

    @Override
    public void killVictim() {
        System.out.println("Yet another wolf has caught his sheep");
    }
}
