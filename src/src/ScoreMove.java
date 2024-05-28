public class ScoreMove {
    public static double score(Move m, int d){
        return 0;
    }

    public static double fScore(Boardstate b){
        double wV = 0;
        double bV = 0;
        double wR = 0;
        double bR = 0;

        return ((wV * Math.sqrt(wR)) - (bV * Math.sqrt(bR)));

    }
}
