import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input 4 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int max = 0;
        int count = 0;
        if (a >= b && a >= d && a >= c)
            max = a;
        else if (b >= a && b >= c && b >= d)
            max = b;
        else if (c >= a && c >= b && c >= d)
            max = c;
        else
            max = d;
        if (a == max)
            count += 1;
        if (b == max)
            count += 1;
        if (c == max)
            count += 1;
        if (d == max)
            count += 1;
        System.out.printf("The number of max is %d", count);
        in.close();

    }
}
