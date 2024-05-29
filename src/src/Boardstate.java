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
                Tile i3 = new Tile();
                i3.setPiece(c.getTile(i, i2).getPiece());
                iAr.add(i3);
            }
            State.add(iAr);
        }
        Rules = new ArrayList<>();
        for (Rule i : c.Rules){
            Rules.add(i);
        }
    } //creates a copy of a board

    public Tile getTile(int x, int y){
        if ((x > X) || (x < 0) || (y > Y) || (y < 0)){
            System.out.println(x);
            System.out.println(y);
            return null;
        }
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
                        //System.out.println(sX + "," + eX + ". " + sY + "," + eY);
                        if (i.isLegalMove(new Move(sX, eX, sY, eY, this))){
                            f.add(new Move(sX, eX, sY, eY, this));
                            //System.out.println(sX + "," + eX + ". " + sY + "," + eY + " V");
                        }
                    }
                }
            }
        }
        return f;
    }

    public String fen(){
        String f = "";
        for (int i = 0; i < X; i ++){
            int a = 0;
            for (int i2 = 0; i2 < Y; i2 ++){
                Tile t = getTile(i, i2);
                if (t.getPiece() == null){
                    a ++;
                }else {
                    if (a > 0){
                        f += a;
                        a = 0;
                    }
                    f += t.getPiece().fen;
                }
            }
            if (a > 0){
                f += a;
                a = 0;
            }
        }
        return f;
    }
}
