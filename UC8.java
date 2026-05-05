public static void main(String[] args) {
    char[][] board = new char[3][3];
    initializeBoard(board); // UC1
    performToss(); // UC2 (Sets currentPlayer and symbols)

    boolean gameRunning = true;

    while (gameRunning) {
        displayBoard(board); // UC1
        System.out.println("\nIt's " + currentPlayer + "'s turn.");

        if (currentPlayer.equals("Human")) {
            // Human Turn Logic (UC3, 4, 5, 6)
            int row, col;
            do {
                int slot = getUserInput();
                row = (slot - 1) / 3;
                col = (slot - 1) % 3;
            } while (!isValidMove(board, row, col));
            
            placeMove(board, row, col, playerSymbol);
        } else {
            // Computer Turn Logic (UC7)
            computerMove(board, computerSymbol);
        }

        // UC8: Check if the game has ended
        if (checkWin(board)) {
            displayBoard(board);
            System.out.println("Congratulations! " + currentPlayer + " wins!");
            gameRunning = false;
        } else if (isBoardFull(board)) {
            displayBoard(board);
            System.out.println("It's a draw!");
            gameRunning = false;
        } else {
            // Switch turns
            currentPlayer = (currentPlayer.equals("Human")) ? "Computer" : "Human";
        }
    }
}