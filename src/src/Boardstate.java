import java.util.ArrayList;
import java.util.Arrays;

public class Boardstate {
    private ArrayList<ArrayList<Tile>> State;
    private ArrayList<Rule> Rules;

    private int X;
    private int Y;
    public Boardstate(int x, int y){
        X = x;
        Y = y;
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

}
