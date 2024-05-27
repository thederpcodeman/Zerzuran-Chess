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
        for (int i = 0; i < x; i++){
            ArrayList<Tile> iAr = new ArrayList<>();
            for (int i2 = 0; i2 < y; i2++){
                iAr.add(new Tile());
            }
            State.add(iAr);
        }
        Rules = new ArrayList<>();
    } //creates a blank X*Y and fresh rules.

}
