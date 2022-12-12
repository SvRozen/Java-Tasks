import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    static boolean checkDate(String date) {
        String pattern = "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[9]|[2-9]\\d)\\d{2})$";
        Pattern p = Pattern.compile(pattern);
        boolean result = false;
        Matcher m = p.matcher(date);
        if (m.matches()) {
            result = true;

            String day = m.group(1);
            String month = m.group(2);
            int year = Integer.parseInt(m.group(3));

            if ((month.equals("04") || month.equals("06") || month.equals("09") || month.equals("11"))
                    && day.equals("31")) {
                result = false;
            } else if (month.equals("02")) {
                if (day.equals("30") || day.equals("31")) {
                    result = false;
                } else if (day.equals("29")) {
                    if (!isLeapYear(year)) {
                        result = false;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a date in format dd/mm/yyyy, where year from 1900 to 9999: ");
        String date = in.nextLine();

        if (checkDate(date)) {
            System.out.println("Correct date");
        } else {
            System.out.println("Incorrect date");
        }

        in.close();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
