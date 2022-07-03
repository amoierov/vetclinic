package src;

import java.util.Scanner;

public class Authentication {

    private static final String LOGIN = "andrew";
    private static final String PASSWORD = "1234";

    private static final String ALOGIN = "admin";
    private static final String APASSWORD = "admin";

    public static int authenticate() {
        Scanner s = new Scanner(System.in);

        int maxCount = 3;
        int LoginSuccess = -1;
        // LoginSuccess = -1 - ошибка авторизации
        // LoginSuccess = 0 - авторизован обычный пользовальтель
        // LoginSuccess = 1 - авторизован администратор



        while (maxCount > 0 && LoginSuccess == -1) {
            if (maxCount < 3) {
                System.out.println("Invalid login or password!");
            }
            System.out.print("Login: ");
            var login = s.nextLine();
            System.out.print("Password: ");
            var password = s.nextLine();
            if (login.equals(LOGIN) && password.equals(PASSWORD)) {
                LoginSuccess = 0;
            }
            if (login.equals(ALOGIN) && password.equals(APASSWORD)) {
                LoginSuccess = 1;
            }
            maxCount--;
        }
        return LoginSuccess;
    }
}
