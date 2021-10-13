package homework6;

import homework6.AnimalActions.Swimmable;

public class Fish implements Swimmable {
    public String getVoice() {
        return "....";
    }

    @Override
    public void swim() {
        System.out.println("Fish swims...");
    }
}
