package homework6;

public class Domestic extends Animal {
    private String name;
    private boolean isVaccinated;

    public Domestic(int age, double weight, String color, String name, boolean isVaccinated){
        super(age,weight,color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getVoice() {
        return super.getVoice() + "my name is " + name + ".";
    }
}
