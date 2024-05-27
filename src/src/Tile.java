public class Tile {
    private Piece piece;
    public Tile(){
        piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece p){
        piece = p;
    }

    public boolean isLegalMove(Move m){
        if (piece.isLegalMove(m) == 0) {
            return false;
        }
        if ((piece.isLegalMove(m) == 1 || piece.isLegalMove(m) == 1) && m.board.getTile(m.eX, m.eY).getPiece().Protection) {
            return false;
        }
        return true;

    }
}
