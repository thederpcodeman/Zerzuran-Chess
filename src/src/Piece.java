public abstract class Piece {
    Boolean Royal;
    Boolean Protection;
    int Value;
    public Piece(Boolean R, Boolean P, int V){
        Royal = R;
        Protection = P;
        Value = V;
    }
    abstract void update();
    abstract int isLegalMove(int sX, int sY, int eX, int eY, Boardstate board); //0 = no, 1 = move, 2 =

}
