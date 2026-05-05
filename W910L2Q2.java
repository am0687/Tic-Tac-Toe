import java.util.Scanner;

public class ManualStringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to split:");
        String input = scanner.nextLine();

        // 1. Get manual split results
        String[] manualWords = splitManually(input);

        // 2. Get built-in split results
        String[] builtInWords = input.split(" ");

        // 3. Compare arrays
        boolean match = compareStringArrays(manualWords, builtInWords);

        // 4. Display results
        System.out.println("\n--- Results ---");
        System.out.println("Manual Words found: " + manualWords.length);
        for (String w : manualWords) System.out.println("[" + w + "]");

        System.out.println("\nDo both methods match? " + match);

        scanner.close();
    }

    /**
     * Finds length using the exception-handling strategy (from previous exercise)
     */
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    /**
     * Splits text manually using charAt() and index tracking
     */
    public static String[] splitManually(String str) {
        int len = getLength(str);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }

        // Word count is spaces + 1 (assuming single spaces)
        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int sIdx = 0;

        // Store space positions
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[sIdx++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;

        // Extract words using space markers
        for (int i = 0; i < spaceCount; i++) {
            words[i] = extractSubstring(str, start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        // Last word (from last space to end of string)
        words[wordCount - 1] = extractSubstring(str, start, len);

        return words;
    }

    /**
     * Helper to extract characters between indices
     */
    public static String extractSubstring(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    /**
     * Compares two String arrays
     */
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}