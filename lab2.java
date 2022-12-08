import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num = in.nextInt();
        // int i = 1;
        int fact = 1;
        // do
        // {
        // fact = fact * i;
        // ++i;

        // }
        // while (i <= num);

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial of num is %d ", fact);

        in.close();
    }
}
