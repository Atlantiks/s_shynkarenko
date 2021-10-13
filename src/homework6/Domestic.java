package homework6;

public class Domestic extends Animal {
    private String name;
    private boolean isVaccinated;

    public String getName() {
        return name;
    }

    public Domestic(int age, int weight, String color, String name, boolean isVaccinated){
        super(age,weight,color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getVoice() {
        return super.getVoice() + "my name is " + name + ".";
    }
}
