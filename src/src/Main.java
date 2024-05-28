import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Boardstate b = new Boardstate(8, 8);

        b.setTile(0,0, new Rook(0));
        b.setTile(1,0, new Knight(0));
        b.setTile(2,0, new Bishop(0));
        b.setTile(3,0, new King(0));
        b.setTile(4,0, new Queen(0));
        b.setTile(5,0, new Bishop(0));
        b.setTile(6,0, new Knight(0));
        b.setTile(7,0, new Rook(0));

        for (int i = 0; i < 8; i++){
            b.setTile(i,1, new Pawn(0));
        }

        b.setTile(0,7, new Rook(1));
        b.setTile(1,7, new Knight(1));
        b.setTile(2,7, new Bishop(1));
        b.setTile(3,7, new King(1));
        b.setTile(4,7, new Queen(1));
        b.setTile(5,7, new Bishop(1));
        b.setTile(6,7, new Knight(1));
        b.setTile(7,7, new Rook(1));

        for (int i = 0; i < 8; i++){
            b.setTile(i,6, new Pawn(1));
        }

        while (true){
            System.out.println(b.fen());
            b = AI.ROB(b).done();
            System.out.println(b.fen());
        }
    }
}