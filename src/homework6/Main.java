package homework6;

public class Main {
    public static void main(String[] args) {
        Dog partosDog = new Dog(3,3,"Brown","Partos",true);
        Dog aramisDog = new GuideDog(3,3,"Brown","Aramis",true,true);
        Dog newDog3 = new GuideDog(3,3,"Brown","Aramis",false,false);
        Dog newDog4 = new GuideDog(8,13,"White","Zerox",true,true);
        Animal myGoopy = new Fish(8,0.2,"Golden");
        Animal leo = new Lion(2,22.7,"Brown");
        System.out.println(partosDog.getVoice());
        System.out.println(aramisDog.getVoice());
        System.out.println(newDog3.getVoice());
        System.out.println(newDog4.getVoice());
        System.out.println(myGoopy.getVoice());
        System.out.println(leo.getVoice());
    }
}
