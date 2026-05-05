/**
 * UC9: Checks if the current player has three symbols in a row
 * @param board The 2D game board
 * @return true if a win is detected
 */
public static boolean checkWin(char[][] board) {
    // 1. Check all Rows
    for (int i = 0; i < 3; i++) {
        if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
            return true;
        }
    }

    // 2. Check all Columns
    for (int j = 0; j < 3; j++) {
        if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
            return true;
        }
    }

    // 3. Check Diagonal (Top-Left to Bottom-Right)
    if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
        return true;
    }

    // 4. Check Anti-Diagonal (Top-Right to Bottom-Left)
    if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
        return true;
    }

    return false;
}