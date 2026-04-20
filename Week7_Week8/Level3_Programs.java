public class Level3_Programs {

    // ================== CONSTANTS ==================
    static final int TEAM_SIZE = 11;
    static final int MIN_HEIGHT = 150;
    static final int MAX_HEIGHT = 250;

    // ================== FOOTBALL TEAM METHODS ==================

    public static int[] generateHeights() {
        int[] heights = new int[TEAM_SIZE];

        for (int i = 0; i < TEAM_SIZE; i++) {
            heights[i] = (int)(Math.random() * (MAX_HEIGHT - MIN_HEIGHT + 1)) + MIN_HEIGHT;
        }
        return heights;
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double calculateMean(int[] array) {
        return (double) calculateSum(array) / array.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void displayArray(String message, int[] array) {
        System.out.print(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // ================== NUMBER CHECKER METHODS ==================

    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);

        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    public static void findLargestAndSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    // ================== MAIN METHOD ==================

    public static void main(String[] args) {

        // ----------- FOOTBALL TEAM PART -----------
        System.out.println("===== FOOTBALL TEAM STATS =====");

        int[] heights = generateHeights();
        displayArray("Player Heights: ", heights);

        int sumHeights = calculateSum(heights);
        double meanHeight = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of Heights: " + sumHeights);
        System.out.println("Mean Height: " + meanHeight);
        System.out.println("Shortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);

        // ----------- NUMBER CHECKER PART -----------
        System.out.println("\n===== NUMBER CHECKER =====");

        int number = (int)(Math.random() * 9000) + 1000; // 4-digit random
        System.out.println("Random Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = getDigits(number);
        displayArray("Digits: ", digits);

        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrong(number));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}