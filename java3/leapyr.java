
import java.util.Scanner;

public class leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is NOT a leap year.");
        }

        sc.close();
    }
}
