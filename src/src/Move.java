public class Move {

    public int sX;
    public int eX;
    public int sY;
    public int eY;

    Boardstate board;

    public Move (int x1, int x2, int y1, int y2, Boardstate b){
        sX = x1;
        eX = x2;
        sY = y1;
        eY = y1;
        board = b;
    }

    public boolean isLegal(){
        return (board.getTile(sX, sY).isLegalMove(this));
    }

    public Boardstate done(){
        int i = board.getTile(sX, sY).getPiece().isLegalMove(this);
        Boardstate n = new Boardstate(board);
        if (i == 1 || i == 4) {
            n.setTile(eX, eY, board.getTile(sX, sY).getPiece());
            n.setTile(sX, sY, null);

        }else if (i == 2){
            n.setTile(eX, eY, null);
        }else if (i == 3){
            n.setTile(eX, eY, board.getTile(sX, sY).getPiece());
            n.setTile(sX, sY, board.getTile(eX, eY).getPiece());
        }
        return n;
    }
}
