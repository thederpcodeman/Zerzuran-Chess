public class MCode {
    public static boolean knight(Move m){
        if (((Math.abs(m.sX - m.eX) == 1) && (Math.abs(m.sY - m.eY) == 2)) || ((Math.abs(m.sX - m.eX) == 2) && (Math.abs(m.sY - m.eY) == 1))){
            return true;
        }
        return false;
    }

    public static boolean rook(Move m) {
        if (m.sY - m.eY == 0) {
            for (int i = 1; i < Math.abs(m.sX - m.eX); i++) {
                if (m.board.getTile((int) (m.sX + (i * Math.signum(m.sX - m.eX))), m.sY).getPiece() != null) {
                    return false;
                }
            }
            return true;
        } else if (m.sX - m.eX == 0) {
            for (int i = 1; i < Math.abs(m.sY - m.eY); i++) {
                if (m.board.getTile(m.sX, (int) (m.sY + (i * Math.signum(m.sY - m.eY)))).getPiece() != null) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    public static boolean bishop(Move m){
        if (Math.abs(m.sX - m.eX) == Math.abs(m.sY - m.eY)){
            for (int i = 1; i < Math.abs(m.sY - m.eY); i++){
                if (m.board.getTile((int)(m.sX + (i * Math.signum(m.sX - m.eX))), (int)(m.sY + (i * Math.signum(m.sY - m.eY)))).getPiece() != null){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
