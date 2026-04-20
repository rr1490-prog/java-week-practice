import java.util.Scanner;

public class Level3_programs {

    // ================= Program 3 =================
    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    // ================= Program 4 =================
    // Method to find character frequencies
    public static int[][] getCharacterFrequency(String text) {
        int[] frequency = new int[256];

        // Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store in 2D array
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }

        return result;
    }

    // Display frequency
    public static void displayFrequency(int[][] data) {
        System.out.println("Character Frequencies:");
        for (int i = 0; i < data.length; i++) {
            char ch = (char) data[i][0];
            int freq = data[i][1];
            System.out.println(ch + " -> " + freq);
        }
    }

    // ================= Main Method =================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Program 3 Output
        char result = findFirstNonRepeating(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        // Program 4 Output
        int[][] freqResult = getCharacterFrequency(input);
        displayFrequency(freqResult);

        sc.close();
    }
}