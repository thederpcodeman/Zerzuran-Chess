import java.util.ArrayList;

public class ScoreMove {
    public static double score(Boardstate c, int d){
        if (d <= 0 || !stillGoing(c)){
            return fScore(c);
        }
        double hs;
        if (c.turn){
            hs = -99999;
            Move b;
            ArrayList<Move> m = c.getLegalMoves();
            b = m.get(0);
            for (Move i : m){
                double s = score(i.done(), d -1);
                if (s > hs){
                    hs = s;
                    b = i;
                }
            }
        }else{
            hs = 99999;
            Move b;
            ArrayList<Move> m = c.getLegalMoves();
            b = m.get(0);
            for (Move i : m){
                double s = score(i.done(), d -1);
                if (s > hs){
                    hs = s;
                    b = i;
                }
            }
        }

        return hs;

    }

    public static double fScore(Boardstate b){
        double wV = 0;
        double bV = 0;
        double wR = 0;
        double bR = 0;
        for (Piece i : b.getPieces()){
            if (i.Color == 1){
                wV += i.Value;
                if (i.Royal){
                    wR ++;
                }
            }else if (i.Color == 2) {
                bV += i.Value;
                if (i.Royal) {
                    bR++;
                }
            }
        }
        return ((wV * Math.sqrt(wR)) - (bV * Math.sqrt(bR)));

    }

    public static boolean stillGoing(Boardstate b){
        int wP = 0;
        int bP = 0;
        boolean wR = false;
        boolean bR = false;
        for (Piece i : b.getPieces()){
            if (i.Color == 1){
                wP++;
                if (i.Royal){
                    wR = true;
                }
            }else if (i.Color == 2) {
                bP++;
                if (i.Royal) {
                    bR = true;
                }
            }
        }
        return (wR && bR && (wP >= 2) && (bP >= 2));
    }
}
