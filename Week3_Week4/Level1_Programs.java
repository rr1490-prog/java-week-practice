import java.util.Scanner;

public class Level1_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1 Divisible by 5
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Divisible by 5? " + (number % 5 == 0));

        // 2 First Smallest
        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Is first smallest? " + (a < b && a < c));

        // 3 Largest Check
        System.out.println("Is first largest? " + (a > b && a > c));
        System.out.println("Is second largest? " + (b > a && b > c));
        System.out.println("Is third largest? " + (c > a && c > b));

        // 4 Natural Number Sum
        System.out.print("Enter natural number: ");
        int n = input.nextInt();

        if (n > 0)
            System.out.println("Sum is " + (n * (n + 1) / 2));
        else
            System.out.println("Not a natural number");

        input.close();
    }
}