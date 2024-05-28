import java.util.ArrayList;

public class AI {
    public static Move ROB(Boardstate b){
        double hs;
        ArrayList<Move> m = b.getLegalMoves();
        if (m.size() < 1){
            System.out.println(ScoreMove.fScore(b));
            System.exit(0);
        }
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
        System.out.println("Rob made a move");
        return f;
    }

}
