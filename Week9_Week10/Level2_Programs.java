import java.util.Scanner;

public class Level2_Programs {

    // 1️⃣ Find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index is out of bound
        }
        return count;
    }

    // 2️⃣ Count number of words
    public static int countWords(String text) {
        int count = 1; // at least one word
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    // 3️⃣ Split text manually using charAt()
    public static String[] splitWords(String text) {

        int wordCount = countWords(text);
        String[] words = new String[wordCount];

        int start = 0, wordIndex = 0;

        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    words[wordIndex++] = text.substring(start, i);
                    start = i + 1;
                }
            } catch (Exception e) {
                words[wordIndex] = text.substring(start);
                break;
            }
        }
        return words;
    }

    // 4️⃣ Compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    // 5️⃣ Convert words + lengths into 2D array
    public static String[][] getWordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 1. Length without length()
        System.out.println("---- STRING LENGTH ----");
        System.out.print("Enter text: ");
        String text1 = sc.next();

        int manualLength = findLength(text1);
        int builtInLength = text1.length();

        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);


        // 🔹 2. Split words and compare
        System.out.println("\n---- SPLIT WORDS ----");
        sc.nextLine(); // clear buffer
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String[] manualWords = splitWords(sentence);
        String[] builtInWords = sentence.split(" ");

        boolean compareResult = compareArrays(manualWords, builtInWords);

        System.out.println("Are both split results equal? " + compareResult);


        // 🔹 3. Words with length (2D Array)
        System.out.println("\n---- WORD + LENGTH TABLE ----");

        String[][] wordTable = getWordWithLength(manualWords);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            System.out.println(wordTable[i][0] + "\t" + len);
        }

        sc.close();
    }
}