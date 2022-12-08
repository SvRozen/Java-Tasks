import java.util.Scanner;

public class lab2_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int x = in.nextInt();
        System.out.println("Input a degree: ");
        int n = in.nextInt();

        // int i = 1;
        // int num = 1;

        // do {
        // num *= x;
        // i++;
        // } while (i <= n);
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= x;
        }
        System.out.printf(" x^n is %d ", num);

        in.close();
    }
}
