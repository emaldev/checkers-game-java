public class Main {
    public static void main(String[] args){
        Tile myTile = new Tile(0, 1);
        myTile.displayTile();
        Board myBoard = new Board();
        myBoard.initPieces();
         Game myGame = new Game();
        myGame.start();
      
        
       
    }
    
}
