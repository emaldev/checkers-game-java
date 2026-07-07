public class Tile {
    private String color;
    private int row;
    private int col;
    private String piece;

    public Tile(int row , int col){
        this.row = row;
        this.col = col;
        this.piece = null;

        if((row + col) % 2 == 0){
            this.color = "light";

        }else{
            this.color = "dark";
        }
    }
    public void displayTile(){
        System.out.println("Tile at (" + row + ", " + col + ") -> Color: " + color + ", Piece: " + piece);

    }
    public String getColor(){return color; }
    public int getRow() {return row; };
    public int getCol() {return col; };
    public String getPiece() {return piece; }
    public void setPiece(String piece) {this.piece = piece; }
    public boolean isEmpty() {return piece == null; };
    
}
