public class ScoreMove {
    public static double score(Boardstate c, int d){

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
}
