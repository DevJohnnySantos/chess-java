package application;

import boardergame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import application.UI;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ChessMatch chessMatch = new ChessMatch();
        while (true) {

            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source : ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece captured = chessMatch.performChessMove(source, target);
        }
    }

}
