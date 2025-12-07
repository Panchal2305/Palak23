import java.util.Scanner;

public class divisibleBy5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("The number is divisible by both 5 and 7.");
        } else {
            System.out.println("The number is NOT divisible by both 5 and 7.");
        }

        sc.close();
    }
}

