import java.util.Scanner;

public class Level3_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Multiple if
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.println("Leap Year");
                    else
                        System.out.println("Not Leap Year");
                } else
                    System.out.println("Leap Year");
            } else
                System.out.println("Not Leap Year");
        }

        // Single if
        if (year >= 1582 &&
            (year % 4 == 0 &&
            (year % 100 != 0 || year % 400 == 0))) {

            System.out.println("Leap Year (Single If)");
        }

        input.close();
    }
}