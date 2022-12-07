import java.util.Scanner;

public class lab1 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Input 4 numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int min = 0;
    if (a <= b && a <= d && a <= c)
      min = a;
    else if (b <= a && b <= c && b <= d)
      min = b;
    else if (c <= a && c <= b && c <= d)
      min = c;
    else
      min = d;
    System.out.printf("Min number is %d", min);
    in.close();

  }
}
