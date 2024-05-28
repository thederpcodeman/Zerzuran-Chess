import java.util.ArrayList;

public class AI {
    public Move ROB(Boardstate b){
        double hs;
        ArrayList<Move> m = b.getLegalMoves();
        Move f = m.get(0);

        if (b.turn){
            hs = -99999;
            for (Move i : m){
                double s = ScoreMove.score(i.done(), 3);
                if (s > hs){
                    hs = s;
                    f = i;
                }
            }
        }else{
            hs = 99999;
            for (Move i : m){
                double s = ScoreMove.score(i.done(), 3);
                if (s < hs){
                    hs = s;
                    f = i;
                }
            }
        }
        return f;
    }

}
