import java.util.Scanner;

public class Level1_Programs {

    // 1️⃣ Compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    // 2️⃣ Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // 3️⃣ Convert string to char array manually
    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // 4️⃣ Generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Causes exception
    }

    // Handle NullPointerException
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled Exception: String is null!");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 1. String Comparison
        System.out.println("---- STRING COMPARISON ----");
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean manualCompare = compareStrings(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        System.out.println("Manual Result: " + manualCompare);
        System.out.println("Built-in equals(): " + builtInCompare);

        // 🔹 2. Substring Creation
        System.out.println("\n---- SUBSTRING ----");
        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Manual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Are equal: " + compareStrings(manualSub, builtInSub));

        // 🔹 3. Char Array Comparison
        System.out.println("\n---- CHAR ARRAY ----");
        System.out.print("Enter text: ");
        String text2 = sc.next();

        char[] manualArr = getCharacters(text2);
        char[] builtInArr = text2.toCharArray();

        boolean arrayResult = compareCharArrays(manualArr, builtInArr);
        System.out.println("Arrays are equal: " + arrayResult);

        // 🔹 4. Exception Demonstration
        System.out.println("\n---- EXCEPTION DEMO ----");

        System.out.println("Generating Exception:");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }

        System.out.println("Handling Exception:");
        handleException();

        sc.close();
    }
}