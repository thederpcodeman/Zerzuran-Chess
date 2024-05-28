public class King extends Piece{
    public King(int c){
        super(true, false, 4, c);
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
