package homework6;

public class Animal {
    private static int counter = 0;
    private final int id;
    private int age;
    private int weight;
    private String color;

    public Animal(int age, int weight, String color) {
        counter++;
        this.age = age;
        this.id = counter;
        this.weight = weight;
        this.color = color;
    }

    public String getVoice() {
        return "Hello, ";
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
