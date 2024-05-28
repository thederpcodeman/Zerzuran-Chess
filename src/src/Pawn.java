public class Pawn extends Piece{
    public Pawn(int c){
        super(false, false, 1, c);
        if (c == 0){
            fen = "p";
        }else if (c == 1){
            fen = "P";
        }
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if (MCode.square(m, 1)) {
            if (MCode.ff(m)) {

                return 5;
            }else{
                return 1;
            }
        }
        else return 0;
    }
}
