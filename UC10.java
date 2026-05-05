/**
 * UC10: Checks if the board is full, indicating a draw
 * @param board The 2D game board
 * @return true if no empty cells remain, false otherwise
 */
public static boolean isBoardFull(char[][] board) {
    // Loop traversal of the 2D array
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            // If we find an empty cell, it's not a draw
            if (board[i][j] == '-') {
                return false; 
            }
        }
    }
    // If the loops finish without finding a '-', the board is full
    return true;
}