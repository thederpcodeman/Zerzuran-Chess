public class Knight extends Piece{
    public Knight(int c){
        super(false, false, 3, c);
        if (c == 0){
            fen = "kn";
        }else if (c == 1){
            fen = "KN";
        }
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
