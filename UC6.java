/**
 * UC6: Updates the board at the specified indices with a player's symbol
 * @param board The 2D game board
 * @param row The target row index
 * @param col The target column index
 * @param symbol The symbol to place ('X' or 'O')
 */
public static void placeMove(char[][] board, int row, int col, char symbol) {
    // Update the specific coordinate in the 2D array
    board[row][col] = symbol;
    
    System.out.println("Placed '" + symbol + "' at row " + row + ", column " + col);
}