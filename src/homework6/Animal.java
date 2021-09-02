package homework6;

public class Animal {
    private static int counter = 0;
    private int id;
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
}
