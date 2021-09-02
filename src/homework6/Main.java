package homework6;

public class Main {
    public static void main(String[] args) {
        Dog newDog = new Dog(3,3,"Brown","Partos",true);
        Dog newDog2 = new GuideDog(3,3,"Brown","Aramis",true,true);
        Dog newDog3 = new GuideDog(3,3,"Brown","Aramis",true,false);
        System.out.println(newDog.getVoice());
        System.out.println(newDog2.getVoice());
        System.out.println(newDog3.getVoice());
    }
}
