import java.util.Scanner;

public class StringLengthDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // 1. Find length using our custom exception-based method
        int customLength = findLengthWithoutMethod(userInput);

        // 2. Find length using the built-in length() method
        int builtInLength = userInput.length();

        // Display results
        System.out.println("\n--- Length Results ---");
        System.out.println("Custom Method Length: " + customLength);
        System.out.println("Built-in Method Length: " + builtInLength);

        if (customLength == builtInLength) {
            System.out.println("The results match perfectly!");
        }

        scanner.close();
    }

    /**
     * Method to find length using an infinite loop and Exception Handling
     */
    public static int findLengthWithoutMethod(String str) {
        int count = 0;
        try {
            // Infinite loop that increments count
            while (true) {
                // Try to access the character at the current count index
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When charAt() tries to access an index that doesn't exist, 
            // the exception is caught here, and we return the count.
            return count;
        }
    }
}