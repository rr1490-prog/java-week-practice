// Level1_Programs.java
// Contains 3 programs:
// 1. Voting Eligibility
// 2. Number Analysis
// 3. Multiplication Table

import java.util.Scanner;

class Level1_Programs {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Menu choice variable
        int choice;

        do {
            // Display menu
            System.out.println("\n===== LEVEL 1 PROGRAMS MENU =====");
            System.out.println("1. Voting Eligibility");
            System.out.println("2. Number Analysis");
            System.out.println("3. Multiplication Table");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    votingEligibility(input);
                    break;

                case 2:
                    numberAnalysis(input);
                    break;

                case 3:
                    multiplicationTable(input);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.err.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        input.close();
    }

    // ================= PROGRAM 1 =================
    // Voting Eligibility
    public static void votingEligibility(Scanner input) {

        final int TOTAL_STUDENTS = 10;
        final int VOTING_AGE = 18;

        int[] ages = new int[TOTAL_STUDENTS];

        System.out.println("\nEnter age of 10 students:");

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Student " + (i + 1) + ": ");
            int age = input.nextInt();

            // Validation
            if (age < 0) {
                System.err.println("Invalid age. Returning to menu.");
                return;
            }

            ages[i] = age;
        }

        System.out.println("\nVoting Eligibility:");

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] >= VOTING_AGE) {
                System.out.println("Age " + ages[i] + " → Can Vote");
            } else {
                System.out.println("Age " + ages[i] + " → Cannot Vote");
            }
        }
    }

    // ================= PROGRAM 2 =================
    // Number Analysis
    public static void numberAnalysis(Scanner input) {

        final int SIZE = 5;
        int[] numbers = new int[SIZE];

        System.out.println("\nEnter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nAnalysis:");

        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            if (num > 0) {

                if (num % 2 == 0) {
                    System.out.println(num + " is Positive Even");
                } else {
                    System.out.println(num + " is Positive Odd");
                }

            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison:");

        if (first > last) {
            System.out.println("First > Last");
        } else if (first < last) {
            System.out.println("First < Last");
        } else {
            System.out.println("First = Last");
        }
    }

    // ================= PROGRAM 3 =================
    // Multiplication Table
    public static void multiplicationTable(Scanner input) {

        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        // Validation
        if (number <= 0) {
            System.err.println("Invalid input. Returning to menu.");
            return;
        }

        final int LIMIT = 10;
        int[] table = new int[LIMIT];

        // Calculate table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display
        System.out.println("\nMultiplication Table:");

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}