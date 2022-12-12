import java.util.Scanner;
import java.util.regex.*;

public class lab3_2 {
    static boolean checkPassword(String password) {
        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*?[0-9])[A-Za-z[0-9]_]{8,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a password: ");
        String password = in.nextLine();

        if (checkPassword(password)) {
            System.out.println("Your password is correct");
        } else
            System.out.println("Create another password");

        in.close();

    }
}