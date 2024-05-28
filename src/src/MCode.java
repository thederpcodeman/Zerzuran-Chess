public class MCode {
    public static boolean ff(Move m){
        if (m.board.getTile(m.eX, m.eY).getPiece() == null){
            return false;
        }
        if (m.board.getTile(m.eX, m.eY).getPiece().Color == m.board.getTile(m.sX, m.sY).getPiece().Color){
            return true;
        }
        return false;
    }
    public static boolean knight(Move m){
        if (((Math.abs(m.sX - m.eX) == 1) && (Math.abs(m.sY - m.eY) == 2)) || ((Math.abs(m.sX - m.eX) == 2) && (Math.abs(m.sY - m.eY) == 1))){
            return true;
        }
        return false;
    }
    public static boolean pawnTemplate(Move m){
        if ((Math.abs(m.sX - m.eX) <= 1) && (Math.abs(m.sY - m.eY) == 1)){
            return true;
        }
        return false;
    }

    public static boolean rook(Move m) {
        if (m.sY - m.eY == 0) {
            if (m.sX < m.eX){
                for (int i = m.sX; i < m.eX; i++) {
                    if (m.board.getTile(i, m.sY).getPiece() != null) {
                        return false;
                    }
                }
            }else{
                for (int i = m.eX; i < m.sX; i++) {
                    if (m.board.getTile(i, m.sY).getPiece() != null) {
                        return false;
                    }
                }
            }

            return true;
        } else if (m.sX - m.eX == 0) {
            if (m.sY < m.eY){
                for (int i = m.sY; i < m.eY; i++) {
                    if (m.board.getTile(m.sX, i).getPiece() != null) {
                        return false;
                    }
                }
            }else {
                for (int i = m.eY; i < m.sY; i++) {
                    if (m.board.getTile(m.sX, i).getPiece() != null) {
                        return false;
                    }
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

    public static boolean square(Move m, int s){
        int dx = Math.abs(m.eX - m.sX);
        int dy = Math.abs(m.eY - m.sY);
        return(dx <= s && dy <= s);
    }
}
