public class Rook extends Piece{
    public Rook(int c){
        super(false, false, 5, c);
        if (c == 0){
            fen = "r";
        }else if (c == 1){
            fen = "R";
        }
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if (MCode.rook(m)) {
            if (MCode.ff(m)) {

                return 5;
            }else{
                return 1;
            }
        }
        else return 0;
    }
}
