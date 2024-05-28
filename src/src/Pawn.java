public class Pawn extends Piece{
    public Pawn(int c){
        super(false, false, 3, c);
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if (MCode.pawnTemplate(m)) {
            if (MCode.ff(m)) {

                return 5;
            }else{
                return 1;
            }
        }
        else return 0;
    }
}
