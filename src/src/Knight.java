public class Knight extends Piece{
    public Knight(int c){
        super(false, false, 3, c);
        if (c == 0){
            fen = "n";
        }else if (c == 1){
            fen = "N";
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
