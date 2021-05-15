package Exception;

import Logger.MyLogger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("password must not empty");
        } else if (password.length() < 5) {
            throw new PasswordException("password must over 5");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("password must include number or special Symbol");
        }
        this.password = password;
    }

    public static void main(String[] args) throws IOException {
        MyLogger myLogger = MyLogger.getLogger();
        PasswordTest test = new PasswordTest();
        System.out.println("input password");

        Scanner in = new Scanner(System.in);
        String password = in.next();

        try {
            test.setPassword(password);
            myLogger.info("Success to set Password");
        } catch (PasswordException e) {
            myLogger.warning(e.getMessage());
        }
    }
}
