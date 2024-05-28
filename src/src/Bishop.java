public class Bishop extends Piece{
    public Bishop(int c){
        super(false, false, 3, c);
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if (MCode.bishop(m)) {
            if (MCode.ff(m)) {

                return 5;
            }else{
                return 1;
            }
        }
        else return 0;
    }
}
