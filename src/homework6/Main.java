package homework6;

public class Main {
    public static void main(String[] args) {
        Dog newDog = new Dog(3,3,"Brown","Partos",true);
        Dog newDog2 = new GuideDog(3,3,"Brown","Aramis",true,true);
        Dog newDog3 = new GuideDog(3,3,"Brown","Aramis",true,false);
        Dog newDog4 = new GuideDog(8,13,"White","Zerox",true,true);
        System.out.println(newDog.getVoice());
        System.out.println(newDog2.getVoice());
        System.out.println(newDog3.getVoice());
        System.out.println(newDog4.getVoice());
        System.out.println(newDog4.getId());
    }
}
