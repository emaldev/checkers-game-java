import java.util.Scanner;
public class Game {
    private Board board;
    private Player[] players;
    private Player currentPlayer;
      // اضافه کردن بازی کنان و نوبت دهی برای ایشان 
    public Game() {
        board = new Board();
        board.setupJumpTest();// جایگزنی میتود پرش 
        players = new Player[2];
        players[0] = new Player("Player 1", "black");
        players[1] = new Player("Player 2", "red");
        currentPlayer = players[0];
    }
    public void switchTurn(){
        if(currentPlayer == players[0]){
            currentPlayer = players[1];
        }else{
            currentPlayer = players[0];
        }
    }
    
    public void start() {
    Scanner input = new Scanner(System.in);

    board.displayBoard();

    System.out.print("Enter from row: ");
    int fromRow = input.nextInt();
    System.out.print("Enter from col: ");
    int fromCol = input.nextInt();
    System.out.print("Enter to row: ");
    int toRow = input.nextInt();
    System.out.print("Enter to col: ");
    int toCol = input.nextInt();

    System.out.print("Is this a jump? (yes/no): ");
    String jump = input.next();

    boolean success;
    if (jump.equalsIgnoreCase("yes")) {
        success = board.jumpPiece(fromRow, fromCol, toRow, toCol);
    } else {
        success = board.movePiece(fromRow, fromCol, toRow, toCol);
    }

    if (success) {
        System.out.println("Move successful!");
    } else {
        System.out.println("Invalid move.");
    }

    board.displayBoard();
    switchTurn();
    System.out.println("Current player: " + currentPlayer.getName() + " (" + currentPlayer.getColor() + ")");
    input.close();
    }
    
}
