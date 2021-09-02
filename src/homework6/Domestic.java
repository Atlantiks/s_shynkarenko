package homework6;

public class Domestic extends Animal {
    private String name;
    private boolean isVaccinated;

    public Domestic(int age, int weight, String color, String name){
        super(age,weight,color);
        this.name = name;
    }
}
