public boolean movePiece(int fromRow, int fromCol, int toRow, int toCol) {
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
    if(rowDiff != 1 || colDiff != 1){
        System.out.println("Invalid move! You can only move diagonally.");
        return false;
    }
    to.setPiece(from.getPiece());
    from.setPiece(null);
    return true;

}

    

