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
        if (getPiece() == null){
            //System.out.println("a");
            return false;
        }
        //if ((m.sX == m.eX) && (m.sY == m.eY)){
        //    System.out.println("b");
        //    return false;
        //}
        int i = piece.isLegalMove(m);
        if (i == 0 || i == 5 || i == 6) {
            //System.out.println("c: " + i);
            return false;
        }
        //System.out.println("d");
        return true;

    }
}
