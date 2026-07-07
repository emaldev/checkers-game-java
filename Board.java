public class Board {
    private Tile[][] tiles;

    // سازنده صفحه 8 در 8 
    public Board(){
        tiles = new Tile[8][8];
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                tiles[row][col] = new Tile(row, col);
            }
        }
    }
    // چاپ برای تست کردن صفحه 
    public void displayBoard(){
        System.out.println(" " + "0 1 2 3 4 5 6 7");
        for(int row = 0; row < 8; row++){
            System.out.print(row + " ");
            for(int col = 0; col < 8; col++){
                Tile t = tiles[row][col];
                if(t.getPiece() != null){
                    System.out.print(t.getPiece() + " ");

                }else if(t.getColor().equals("dark")){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    // برای دسترسی به یک خانه خاص 
    public Tile getTile(int row, int col){
        return tiles[row][col];
    }
    // 
    public void initPieces(){
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                Tile t = tiles[row][col];
                if(t.getColor().equals("dark")) {
                    if(row < 3) {
                        t.setPiece("b");// مهره سیاه 
                    }else if(row  > 4) {
                        t.setPiece("r");// مهره قرمز 
                    }
                }
            }
        }
    }
    
}
