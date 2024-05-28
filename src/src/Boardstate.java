import java.util.ArrayList;
import java.util.Arrays;

public class Boardstate {
    private ArrayList<ArrayList<Tile>> State;
    private ArrayList<Rule> Rules;

    private int X;
    private int Y;
    public boolean turn; //true = W
    public Boardstate(int x, int y){
        X = x;
        Y = y;
        turn = true;
        State = new ArrayList<>();
        for (int i = 0; i < X; i++){
            ArrayList<Tile> iAr = new ArrayList<>();
            for (int i2 = 0; i2 < Y; i2++){
                iAr.add(new Tile());
            }
            State.add(iAr);
        }
        Rules = new ArrayList<>();
    } //creates a blank X*Y and fresh rules.
    public Boardstate(Boardstate c){
        X = c.X;
        Y = c.Y;
        turn = c.turn;
        State = new ArrayList<>();
        for (int i = 0; i < X; i++){
            ArrayList<Tile> iAr = new ArrayList<>();
            for (int i2 = 0; i2 < Y; i2++){
                iAr.add(new Tile());
            }
            State.add(iAr);
        }
        Rules = new ArrayList<>();
        for (Rule i : c.Rules){
            Rules.add(i);
        }
    } //creates a copy of a board

    public Tile getTile(int x, int y){
        return State.get(x).get(y);
    }

    public void setTile(int x, int y, Piece n){
        State.get(x).get(y).setPiece(n);
    }
    public ArrayList<Piece> getPieces(){
        ArrayList<Piece> f = new ArrayList<>();
        for (ArrayList<Tile> i : State){
            for (Tile i2 : i){
                if (i2.getPiece() != null){
                    f.add(i2.getPiece());
                }
            }
        }
        return f;
    }

    public void switchTurn(){
        turn = !turn;
    }

    public ArrayList<Move> getLegalMoves() {
        ArrayList<Move> f = new ArrayList<>();
        for (int sX = 0; sX < X; sX++){
            for (int sY = 0; sY < Y; sY++){
                for (int eX = 0; eX < X; eX++){
                    for (int eY = 0; eY < Y; eY++){
                        Tile i = getTile(sX, sY);
                        if ((i.getPiece() != null) && (i.isLegalMove(new Move(sX, eX, sY, eY, this)))){
                            f.add(new Move(sX, eX, sY, eY, this));
                        }
                    }
                }
            }
        }
        return f;
    }
}
