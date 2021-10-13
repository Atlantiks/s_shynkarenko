package homework6;

import homework6.AnimalActions.Swimmable;

public class Crocodile extends Wild implements Swimmable {
    public Crocodile(int age, int weight, String color) {
        super(age, weight, color,true);
    }

    @Override
    public void swim() {
        System.out.println("Crocodiles swim and even dive...");
    }
}
