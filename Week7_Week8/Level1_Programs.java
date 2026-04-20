import java.util.Scanner;

public class Level1_Programs {

    // ================= SIMPLE INTEREST =================
    public double calculateSimpleInterest(double principalAmount, double rateOfInterest, double timePeriod) {
        double simpleInterestValue;
        simpleInterestValue = (principalAmount * rateOfInterest * timePeriod) / 100;
        return simpleInterestValue;
    }

    // ================= HANDSHAKES =================
    public int calculateMaximumHandshakes(int numberOfStudents) {
        int totalHandshakes;
        totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return totalHandshakes;
    }

    // ================= ATHLETE ROUNDS =================
    public double calculateNumberOfRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter;
        double numberOfRounds;

        perimeter = side1 + side2 + side3;
        numberOfRounds = totalDistance / perimeter;

        return numberOfRounds;
    }

    // ================= NUMBER SIGN =================
    public int checkNumberSign(int inputNumber) {
        if (inputNumber > 0) {
            return 1;
        } else if (inputNumber < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    // ================= MAIN METHOD =================
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Level1_Programs program = new Level1_Programs();

        // -------- SIMPLE INTEREST --------
        double principalAmount;
        double rateOfInterest;
        double timePeriod;
        double simpleInterestResult;

        System.out.println("===== SIMPLE INTEREST =====");
        System.out.print("Enter Principal: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        rateOfInterest = scanner.nextDouble();

        System.out.print("Enter Time: ");
        timePeriod = scanner.nextDouble();

        simpleInterestResult = program.calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);

        System.out.println("Simple Interest = " + simpleInterestResult);


        // -------- HANDSHAKES --------
        int numberOfStudents;
        int handshakeResult;

        System.out.println("\n===== HANDSHAKES =====");
        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();

        handshakeResult = program.calculateMaximumHandshakes(numberOfStudents);

        System.out.println("Maximum Handshakes = " + handshakeResult);


        // -------- ATHLETE ROUNDS --------
        double sideA;
        double sideB;
        double sideC;
        double totalDistanceMeters = 5000;
        double roundsResult;

        System.out.println("\n===== ATHLETE RUN =====");
        System.out.print("Enter side A: ");
        sideA = scanner.nextDouble();

        System.out.print("Enter side B: ");
        sideB = scanner.nextDouble();

        System.out.print("Enter side C: ");
        sideC = scanner.nextDouble();

        roundsResult = program.calculateNumberOfRounds(sideA, sideB, sideC, totalDistanceMeters);

        System.out.println("Number of Rounds = " + roundsResult);


        // -------- NUMBER SIGN --------
        int inputNumber;
        int signResult;

        System.out.println("\n===== NUMBER SIGN CHECK =====");
        System.out.print("Enter a number: ");
        inputNumber = scanner.nextInt();

        signResult = program.checkNumberSign(inputNumber);

        if (signResult == 1) {
            System.out.println("Positive Number");
        } else if (signResult == -1) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}