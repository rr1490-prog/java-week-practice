// Program to find frequency of each digit in a number using array

import java.util.Scanner;

class Level3_Programs {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid number.");
            input.close();
            return;
        }

        // Step 1: Count digits
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        int index = 0;

        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Step 3: Frequency array (0–9 digits)
        int[] frequency = new int[10];

        // Step 4: Count frequency
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Step 5: Display result
        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " → " + frequency[i] + " times");
            }
        }

        input.close();
    }
}