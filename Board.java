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
    public boolean movePiece(int fromRow, int fromCol, int toRow, int toCol) {
    Tile from = tiles[fromRow][fromCol];
    Tile to = tiles[toRow][toCol];

    if (from.isEmpty()) {
        System.out.println("No piece at the selected position!");
        return false;
    }
    if (!to.isEmpty()) {
        System.out.println("Target position is not empty!");
        return false;
    }

    int rowDiff = Math.abs(toRow - fromRow);
    int colDiff = Math.abs(toCol - fromCol);
    if (rowDiff != 1 || colDiff != 1) {
        System.out.println("Invalid move! You can only move diagonally.");
        return false;
    }

    to.setPiece(from.getPiece());
    from.setPiece(null);
    return true;
}
public boolean jumpPiece(int fromRow, int fromCol, int toRow, int toCol){
    Tile from = tiles[fromRow][fromCol];
    Tile to = tiles[toRow][toCol];

    if(from.isEmpty()){
        System.out.println("No piece at the selected position!");
        return false;
    }
    if(!to.isEmpty()){
        System.out.println("Target position is not empty!");
        return false;
    }
    int rowDiff = Math.abs(toRow - fromRow);
    int colDiff = Math.abs(toCol - fromCol);
    if(rowDiff != 2 || colDiff != 2){
        System.out.println("Invalid jump! You can only jump tow squares diagonally.");
        return false;
    }
    int midRow = (fromRow + toRow) / 2;
    int midCol = (fromCol + toCol) / 2;
    Tile mid = tiles[midRow][midCol];
    

    if(mid.isEmpty()){
        System.out.println("No piece to capture!");
        return false;
    }
    
    if(mid.getPiece().equals(from.getPiece())){
        System.out.println("You connot jump over your own piece!");
        return false;
    }

    to.setPiece(from.getPiece());
    from.setPiece(null);
    mid.setPiece(null);
    return true;
}
// میتود پرش 
public void setupJumpTest(){
    // پاک کردن صفحه 
    for(int row = 0; row < 8; row++){
        for(int col = 0; col < 8; col++){
            tiles[row][col].setPiece(null);
        }
    }
    //قرار دادن مهره ها برا تست پرش 
    tiles[2][1].setPiece("b");// مهره سیاه 
    tiles[3][2].setPiece("r");// مهره قرمز 
    // خانه (3و4) خالی می ماند 
}
    
}


