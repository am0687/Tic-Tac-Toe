import java.util.Random;

public class TicTacToe {
    // Game State Variables
    static char playerSymbol;
    static char computerSymbol;
    static String currentPlayer;

    public static void main(String[] args) {
        performToss();
    }

    /**
     * UC2: Performs a toss to decide who starts and assigns symbols
     */
    public static void performToss() {
        Random random = new Random();
        // 0 for Human, 1 for Computer
        int toss = random.nextInt(2);

        if (toss == 0) {
            System.out.println("Toss Result: Human wins!");
            playerSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = "Human";
        } else {
            System.out.println("Toss Result: Computer wins!");
            computerSymbol = 'X';
            playerSymbol = 'O';
            currentPlayer = "Computer";
        }

        System.out.println(currentPlayer + " starts first with symbol 'X'");
    }
}