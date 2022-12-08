
import java.util.Scanner;

public class lab2_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int n = in.nextInt();
        int num = 5;

        int i = 0;

        do {
            num -= 5;
            i++;
            System.out.print(num);
        } while (i < n);

        // for (int i = 0; i < n; i++) {
        // num -= 5;

        // System.out.print(num);

        // }

        in.close();
    }
}
