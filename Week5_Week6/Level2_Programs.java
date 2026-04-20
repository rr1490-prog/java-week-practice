// Level2_Programs.java
// Contains 3 programs:
// 1. Employee Bonus (Zara)
// 2. Youngest & Tallest Friend
// 3. Largest & Second Largest Digit

import java.util.Scanner;

class Level2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n===== LEVEL 2 PROGRAMS =====");
            System.out.println("1. Employee Bonus (Zara)");
            System.out.println("2. Youngest & Tallest Friend");
            System.out.println("3. Largest & Second Largest Digit");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    employeeBonus(input);
                    break;
                case 2:
                    friendAnalysis(input);
                    break;
                case 3:
                    digitAnalysis(input);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.err.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }

    // ================= PROGRAM 1 =================
    // Employee Bonus (Zara)
    public static void employeeBonus(Scanner input) {

        final int SIZE = 10;

        double[] salary = new double[SIZE];
        double[] years = new double[SIZE];
        double[] bonus = new double[SIZE];
        double[] newSalary = new double[SIZE];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input
        System.out.println("\nEnter salary and years of service:");

        for (int i = 0; i < SIZE; i++) {

            System.out.print("Employee " + (i + 1) + " Salary: ");
            double sal = input.nextDouble();

            System.out.print("Years of Service: ");
            double yr = input.nextDouble();

            // Validation
            if (sal <= 0 || yr < 0) {
                System.err.println("Invalid input. Re-enter.");
                i--; // retry same index
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        // Processing
        for (int i = 0; i < SIZE; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\nTotal Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    // ================= PROGRAM 2 =================
    // Youngest & Tallest Friend
    public static void friendAnalysis(Scanner input) {

        final int SIZE = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[SIZE];
        double[] heights = new double[SIZE];

        // Input
        for (int i = 0; i < SIZE; i++) {

            System.out.print(names[i] + " Age: ");
            int age = input.nextInt();

            System.out.print(names[i] + " Height: ");
            double height = input.nextDouble();

            // Validation
            if (age <= 0 || height <= 0) {
                System.err.println("Invalid input. Re-enter.");
                i--;
                continue;
            }

            ages[i] = age;
            heights[i] = height;
        }

        // Find youngest & tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < SIZE; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
        System.out.println("\nYoungest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }

    // ================= PROGRAM 3 =================
    // Largest & Second Largest Digit
    public static void digitAnalysis(Scanner input) {

        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        // Validation
        if (number <= 0) {
            System.err.println("Invalid number.");
            return;
        }

        final int MAX_DIGITS = 10;
        int[] digits = new int[MAX_DIGITS];
        int index = 0;

        // Store digits
        while (number != 0 && index < MAX_DIGITS) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest & second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output
        System.out.println("\nLargest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}