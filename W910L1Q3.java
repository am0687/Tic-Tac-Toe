import java.util.Scanner;

public class StringToArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // 1. Get character array using user-defined method
        char[] manualArray = getCharsManually(input);

        // 2. Get character array using built-in toCharArray() method
        char[] builtInArray = input.toCharArray();

        // 3. Compare the two arrays
        boolean areEqual = compareCharacterArrays(manualArray, builtInArray);

        // 4. Display results
        System.out.println("\n--- Comparison Results ---");
        System.out.print("Manual Array:   ");
        printArray(manualArray);
        
        System.out.print("Built-in Array: ");
        printArray(builtInArray);

        System.out.println("Do the arrays match? " + areEqual);

        scanner.close();
    }

    /**
     * User-defined method to extract characters without toCharArray()
     */
    public static char[] getCharsManually(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    /**
     * Method to compare two character arrays
     */
    public static boolean compareCharacterArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Helper method to print array elements
     */
    public static void printArray(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'" + arr[i] + "'" + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}