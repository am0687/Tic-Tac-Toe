import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input using next()
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // 1. Compare using custom charAt() method
        boolean customResult = compareUsingCharAt(str1, str2);

        // 2. Compare using built-in equals() method
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("\n--- Comparison Results ---");
        System.out.println("Custom charAt() comparison: " + customResult);
        System.out.println("Built-in equals() comparison: " + builtInResult);

        // Check if both results match
        if (customResult == builtInResult) {
            System.out.println("Success: Both methods returned the same result.");
        } else {
            System.out.println("Error: The results do not match.");
        }

        scanner.close();
    }

    /**
     * Method to compare two strings character by character
     */
    public static boolean compareUsingCharAt(String s1, String s2) {
        // First check: if lengths are different, strings cannot be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Second check: compare each character at every index
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // Found a mismatch, strings are not equal
            }
        }

        // If loop completes, all characters matched
        return true;
    }
}