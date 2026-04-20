import java.util.Scanner;

public class Level2_Programs {

    // ================= FACTORS METHODS =================

    // Method to count factors
    public static int countFactors(int inputNumber) {
        int factorCount = 0;

        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                factorCount++;
            }
        }
        return factorCount;
    }

    // Method to get factors array
    public static int[] getFactors(int inputNumber, int factorCount) {
        int[] factorsArray = new int[factorCount];
        int index = 0;

        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                factorsArray[index] = i;
                index++;
            }
        }
        return factorsArray;
    }

    // Method to sum factors
    public static int calculateSumOfFactors(int[] factorsArray) {
        int sumOfFactors = 0;

        for (int i = 0; i < factorsArray.length; i++) {
            sumOfFactors += factorsArray[i];
        }
        return sumOfFactors;
    }

    // Method to product of factors
    public static int calculateProductOfFactors(int[] factorsArray) {
        int productOfFactors = 1;

        for (int i = 0; i < factorsArray.length; i++) {
            productOfFactors *= factorsArray[i];
        }
        return productOfFactors;
    }

    // Method to sum of squares
    public static double calculateSumOfSquares(int[] factorsArray) {
        double sumOfSquares = 0;

        for (int i = 0; i < factorsArray.length; i++) {
            sumOfSquares += Math.pow(factorsArray[i], 2);
        }
        return sumOfSquares;
    }

    // ================= NATURAL NUMBERS =================

    // Recursive method
    public static int calculateSumRecursive(int number) {
        if (number == 1) {
            return 1;
        }
        return number + calculateSumRecursive(number - 1);
    }

    // Formula method
    public static int calculateSumFormula(int number) {
        int result;
        result = number * (number + 1) / 2;
        return result;
    }

    // ================= LEAP YEAR =================

    public static boolean checkLeapYear(int yearValue) {
        boolean isLeap;

        if ((yearValue % 4 == 0 && yearValue % 100 != 0) || (yearValue % 400 == 0)) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        return isLeap;
    }

    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------- FACTORS PROGRAM --------
        int inputNumber;
        int factorCount;
        int[] factorsArray;
        int sumOfFactors;
        int productOfFactors;
        double sumOfSquares;

        System.out.println("===== FACTORS PROGRAM =====");
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();

        factorCount = countFactors(inputNumber);
        factorsArray = getFactors(inputNumber, factorCount);

        sumOfFactors = calculateSumOfFactors(factorsArray);
        productOfFactors = calculateProductOfFactors(factorsArray);
        sumOfSquares = calculateSumOfSquares(factorsArray);

        System.out.print("Factors: ");
        for (int i = 0; i < factorsArray.length; i++) {
            System.out.print(factorsArray[i] + " ");
        }

        System.out.println("\nSum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);


        // -------- NATURAL NUMBERS PROGRAM --------
        int naturalNumber;
        int recursiveResult;
        int formulaResult;

        System.out.println("\n===== SUM OF NATURAL NUMBERS =====");
        System.out.print("Enter a natural number: ");
        naturalNumber = scanner.nextInt();

        if (naturalNumber > 0) {
            recursiveResult = calculateSumRecursive(naturalNumber);
            formulaResult = calculateSumFormula(naturalNumber);

            System.out.println("Recursive Result: " + recursiveResult);
            System.out.println("Formula Result: " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are NOT equal.");
            }
        } else {
            System.out.println("Invalid input. Enter a natural number.");
        }


        // -------- LEAP YEAR PROGRAM --------
        int inputYear;
        boolean leapResult;

        System.out.println("\n===== LEAP YEAR CHECK =====");
        System.out.print("Enter year: ");
        inputYear = scanner.nextInt();

        if (inputYear >= 1582) {
            leapResult = checkLeapYear(inputYear);

            if (leapResult) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }

        scanner.close();
    }
}