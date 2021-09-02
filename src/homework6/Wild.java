package homework6;

public class Wild extends Animal {
    private boolean isPredator;

    public Wild(int age, int weight, String color,boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }


    public String getVoice() {
        return isPredator ? super.getVoice() + "I am a wild animal and I'm hungry" : super.getVoice() + "I am a wild animal";
    }
}
