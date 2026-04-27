public class TicTacToe {

    public static void main(String[] args) {
        // Example: Converting slot 5
        int slot = 5;
        convertToIndices(slot);
    }

    /**
     * UC4: Converts slot number (1-9) to row and column indices
     * @param slot the number entered by the user
     */
    public static void convertToIndices(int slot) {
        // Adjust for zero-based indexing
        int adjustedSlot = slot - 1;

        int row = adjustedSlot / 3;
        int col = adjustedSlot % 3;

        System.out.println("Slot " + slot + " maps to: Row " + row + ", Column " + col);
        
        // In the next UC, you will use these to update the board:
        // board[row][col] = playerSymbol;
    }
}