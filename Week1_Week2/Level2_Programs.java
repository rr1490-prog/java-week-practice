\import java.util.Scanner;

public class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Program 1: Triangle Area
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Triangle area: " + area);

        // Program 2: Square Side
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;
        System.out.println("Square side: " + side);

        input.close();
    }
}