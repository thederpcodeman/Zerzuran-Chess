import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();



        Boardstate b = new Boardstate(8, 8);

        b.setTile(0,0, new Rook(0));
        b.setTile(0,1, new Knight(0));
        b.setTile(0,2, new Bishop(0));
        b.setTile(0,3, new King(0));
        b.setTile(0,4, new Queen(0));
        b.setTile(0,5, new Bishop(0));
        b.setTile(0,6, new Knight(0));
        b.setTile(0,7, new Rook(0));

        for (int i = 0; i < 8; i++){
            b.setTile(1,i, new Pawn(0));
        }

        b.setTile(7,0, new Rook(1));
        b.setTile(7,1, new Knight(1));
        b.setTile(7,2, new Bishop(1));
        b.setTile(7,3, new King(1));
        b.setTile(7,4, new Queen(1));
        b.setTile(7,5, new Bishop(1));
        b.setTile(7,6, new Knight(1));
        b.setTile(7,7, new Rook(1));

        for (int i = 0; i < 8; i++){
            b.setTile(6,i, new Pawn(1));
        }

        while (true){
            b.printScreen();

            Thread.sleep(1000);

            b = AI.ROB(b).done();
        }
    }
}