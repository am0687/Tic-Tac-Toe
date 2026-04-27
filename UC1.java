public class TicTacToe {
    public static void main(String[] args) {
        // UC1: Create a 3x3 character array
        char[][] board = new char[3][3];

        // Initialize board with '-'
        initializeBoard(board);

        // Print the board to console
        displayBoard(board);
    }

    /**
     * Fills the 2D array with default empty markers
     */
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * Prints the board with clear formatting
     */
    public static void displayBoard(char[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Print the cell value and a space for clarity
                System.out.print(board[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}