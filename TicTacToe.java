import java.util.Scanner;

public class TicTacToe{
    private static final int SIZE = 3;
    private static String[][] board = new String[SIZE][SIZE];
    private static final Scanner scanner = new Scanner(System.in);

    private static void initializeBoard(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                board[i][j] = " ";
            }
        }
    }
    private static void printBoard(){
        for(int i = 0; i < SIZE; i++){
            System.out.println(" " + String.join(" | ", board[i]));
            if(i < SIZE - 1){
                System.out.println("---+---+---");
            }
        }
    }
    private static String checkWinner(){
        for(int i = 0; i < SIZE; i++){
            if(isLineEqual(board[i][0], board[i][1], board[i][2])){
                return board[i][0];
        }
        if(isLineEqual(board[0][i], board[1][i], board[2][i])){
            return board[0][i];
        }
    }
    if(isLineEqual(board[0][0], board[1][1], board[2][2])){
        return board[0][0];
    }
    if(isLineEqual(board[0][2], board[1][1], board[2][2])){
        return board[0][2];
    }
    return null;
}
private static boolean isLineEqual(String a, String b, String c){
    return !a.equals(" ") && a.equals(b) && b.equals(c);
}
private static void playerMove(String player){
    int row, col;
    while (true) {
        System.out.printf("%s's Turn: ENetr row(0-2) and column(0-2):%n", player);
        row = scanner.nextInt();
        col = scanner.nextInt();
        if(isValidMove(row, col)){
            board[row][col] = player;
            break;
        }else{
            System.out.println("Invalid move, please try again");
        }
    }
}
    private static boolean isValidMove(int row, int col){
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col].equals(" ");
    }
    public static void main(String[] args){
        initializeBoard();
        String winner = null;
        String currentPlayer = "X";

        for(int move = 0; move < SIZE * SIZE && winner == null; move++){
            printBoard();
            playerMove(currentPlayer);
            winner = checkWinner();
            currentPlayer = currentPlayer.equals("X") ? "0" : "X";
        }
        printBoard();
        if(winner != null){
            System.out.println("Congradulations! Player " + winner + " wins!");
            }else{
                System.out.println("It's a draw!");
        }
    }
}
