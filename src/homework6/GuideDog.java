package homework6;

public class GuideDog extends Dog {
    private boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public String getVoice() {
        return isTrained ? super.getVoice() + "I can take you home\n" : super.getVoice();
    }
}
