import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input 5 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int max = 0;

        if (a >= b && a >= d && a >= c && a >= e)
            max = a;
        else if (b >= a && b >= c && b >= d && b >= e)
            max = b;
        else if (c >= a && c >= b && c >= d && c >= e)
            max = c;
        else if (d >= a && d >= b && d >= c && d >= e)
            max = d;
        else
            max = e;

        System.out.printf("Max number is %d", max);
        System.out.println();

        int min = 0;
        if (a <= b && a <= d && a <= c && a <= e)
            min = a;
        else if (b <= a && b <= c && b <= d && b <= e)
            min = b;
        else if (c <= a && c <= b && c <= d && c <= e)
            min = c;
        else if (d <= a && d <= b && d <= c && d <= e)
            min = d;
        else
            min = e;
        System.out.printf("Min number is %d", min);
        in.close();

    }
}
