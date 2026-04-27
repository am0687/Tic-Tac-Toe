import java.util.Scanner;

public class TicTacToe {
    // Scanner is declared outside to be reused by other methods
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Example of calling the UC3 method
        int slot = getUserInput();
        System.out.println("You selected slot: " + slot);
    }

    /**
     * UC3: Reads an integer input from the user (1-9)
     * @return the chosen slot number
     */
    public static int getUserInput() {
        System.out.print("Enter a slot number (1-9): ");
        
        // Basic input reading
        int slot = scanner.nextInt();
        
        return slot;
    }
}