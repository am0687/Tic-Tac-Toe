import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String original = scanner.next();

        System.out.print("Enter start index (inclusive): ");
        int start = scanner.nextInt();

        System.out.print("Enter end index (exclusive): ");
        int end = scanner.nextInt();

        // 1. Create substring using manual charAt() method
        String manualSub = createManualSubstring(original, start, end);

        // 2. Create substring using built-in method
        // Note: Built-in substring(start, end) also uses exclusive end index
        String builtInSub = original.substring(start, end);

        // 3. Compare the two results
        boolean match = compareStrings(manualSub, builtInSub);

        // Display results
        System.out.println("\n--- Substring Results ---");
        System.out.println("Manual Substring:  " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Do they match?      " + match);

        scanner.close();
    }

    /**
     * Method to create a substring using charAt()
     */
    public static String createManualSubstring(String str, int start, int end) {
        String result = "";
        // Loop from start index up to (but not including) the end index
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * Method to compare two strings using charAt()
     */
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}