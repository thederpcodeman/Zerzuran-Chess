public abstract class Piece {
    public Piece(){

    }
    public void update(){
    }
    public int isLegalMove(int sX, int sY, int eX, int eY, Boardstate board){ //0 = no, 1 = move, 2 =
        return 0;
    }
}
