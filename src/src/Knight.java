public class Knight extends Piece{
    public Knight(){
        super(false, false, 3);
    }
    public void update(){

    }
    public int isLegalMove(Move m){
        if (MCode.knight(m)) {
            return 1;
        }
        else return 0;
    } //0 = No, 1 = Move, 2 = Destroy, 3 = Swap, 4 = En pessant
}
