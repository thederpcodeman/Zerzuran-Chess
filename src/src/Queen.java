public class Queen extends Piece{
    public Queen(int c){
        super(false, false, 9, c);
        if (c == 0){
            fen = "q";
        }else if (c == 1){
            fen = "Q";
        }
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if ((MCode.bishop(m)) || (MCode.rook(m))) {
            if (MCode.ff(m)) {

                return 5;
            }else{
                return 1;
            }
        }
        else return 0;
    }
}
