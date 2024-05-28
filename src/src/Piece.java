public abstract class Piece {
    public boolean Royal;
    public boolean Protection;
    public int Value;
    public int Color;
    public Piece(Boolean R, Boolean P, int V, int C){
        Royal = R;
        Protection = P;
        Value = V;
        Color = C;
    }
    abstract void update();
    abstract int isLegalMove(Move m); //0 = No, 1 = Move, 2 = Destroy, 3 = Swap, 4 = En pessant, 5 = ffMove, 6 = ffDestroy
}
