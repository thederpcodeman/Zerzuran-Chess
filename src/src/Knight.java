public class Knight extends Piece{
    public Knight(int c){
        super(false, false, 3, c);
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if (MCode.knight(m)) {
            if (MCode.ff(m)) {

                return 5;
            }else{
                return 1;
            }
        }
        else return 0;
    }
}
