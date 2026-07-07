public class Game {
    private Board board;
    private Player[] players;
    private Player currentPlayer;
      // اضافه کردن بازی کنان و نوبت دهی برای ایشان 
    public Game() {
        board = new Board();
        board.initPieces();
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
        switchTurn();
        board.displayBoard();
        board.movePiece(2, 1, 3, 2);
        System.out.println("After move: ");
        board.displayBoard();
        System.out.println("Current player: " + currentPlayer.getName() + "(" + currentPlayer.getColor() + ")");
    }
    
}
