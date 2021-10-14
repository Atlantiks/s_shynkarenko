package homework11;

import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
    static Map<String, String> loginData = new HashMap<>();

    static {
        loginData.put("Alfa","123456");
        loginData.put("Beta","12345678");
    }

    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) password = "";
        try {
            isLoginValid(login);
            isPasswordValid(password);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        if (loginData.containsKey(login)) {
            return password.equals(loginData.get(login));
        }
        return false;
    }

    private static void isPasswordValid(String password) throws WrongPasswordException {
        if (password.equals("")) {
            throw new WrongPasswordException("Password/Confirmed Password don't match each other.");
        } else if(!password.matches("[0-9A-Za-z_]{1,20}")) {
            throw new WrongPasswordException("Incorrect Password. Password may contain only latin letters, numbers and \"_\"");
        }
    }

    private static void isLoginValid(String login) throws WrongLoginException {
        if (!login.matches("[0-9A-Za-z_]{1,20}")) {
            throw new WrongLoginException("Incorrect login. Login may contain only latin letters, numbers and \"_\"");
        }
    }

}
