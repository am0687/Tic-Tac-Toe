/**
 * UC7: Computer generates a random move and places it on the board
 * @param board The 2D game board
 * @param computerSymbol The symbol assigned to the computer ('X' or 'O')
 */
public static void computerMove(char[][] board, char computerSymbol) {
    Random random = new Random();
    int row, col, slot;
    boolean movePlaced = false;

    System.out.println("Computer is thinking...");

    do {
        // Generate a random slot between 1 and 9
        slot = random.nextInt(9) + 1;

        // Convert slot to row and column (Logic from UC4)
        row = (slot - 1) / 3;
        col = (slot - 1) % 3;

        // Validate the move (Logic from UC5)
        if (isValidMove(board, row, col)) {
            // Place the move if valid (Logic from UC6)
            placeMove(board, row, col, computerSymbol);
            movePlaced = true;
        }
        // If not valid, the loop runs again to pick a different random slot
    } while (!movePlaced);
}