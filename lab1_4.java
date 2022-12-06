import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number of month: ");
        int month = in.nextInt();
        String seasonString;
        switch (month) {
            case 1:
                seasonString = "Winter";
                break;
            case 2:
                seasonString = "Winter";
                break;
            case 3:
                seasonString = "Spring";
                break;
            case 4:
                seasonString = "Spring";
                break;
            case 5:
                seasonString = "Spring";
                break;
            case 6:
                seasonString = "Summer";
                break;
            case 7:
                seasonString = "Summer";
                break;
            case 8:
                seasonString = "Summer";
                break;
            case 9:
                seasonString = "Autumn";
                break;
            case 10:
                seasonString = "Autumn";
                break;
            case 11:
                seasonString = "Autumn";
                break;
            case 12:
                seasonString = "Winter";
                break;
            default:
                seasonString = "Error";
                break;
        }

        System.out.print(seasonString);

    }
}
