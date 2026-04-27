/**
 * UC5: Validates if the move is within bounds and the cell is empty
 * @param board The 2D game board
 * @param row The row index (0-2)
 * @param col The column index (0-2)
 * @return true if the move is valid, false otherwise
 */
public static boolean isValidMove(char[][] board, int row, int col) {
    // 1. Boundary Checking: Ensure row and col are between 0 and 2
    if (row < 0 || row > 2 || col < 0 || col > 2) {
        System.out.println("Invalid input: Move is out of bounds!");
        return false;
    }

    // 2. Occupancy Check: Ensure the cell contains the empty marker '-'
    if (board[row][col] != '-') {
        System.out.println("Invalid move: Slot already taken!");
        return false;
    }

    // If both checks pass
    return true;
}