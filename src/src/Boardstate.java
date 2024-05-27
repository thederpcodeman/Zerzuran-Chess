import java.util.ArrayList;
import java.util.Arrays;

public class Boardstate {
    private ArrayList<ArrayList<Tile>> State;
    private ArrayList<Rule> Rules;
    public Boardstate(int x, int y){
        State = new ArrayList<>();
        for (int i = 0; i < x; i++){
            ArrayList<Tile> iAr = new ArrayList<>();
            for (int i2 = 0; i2 < y; i2++){
                iAr.add(new Tile());
            }
            State.add(iAr);
        }
        Rules = new ArrayList<>();
    } //creates a blank 8x8 and fresh rules.

}
