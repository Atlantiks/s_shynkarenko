package homework11;

public class TestLoginUtil {
    public static void main(String[] args) {
        System.out.println(LoginUtil.isUserAuthentic(
                "Alfa",
                "123456!_",
                "123456!_"));
    }
}
