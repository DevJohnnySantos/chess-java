package application;

import boardergame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import application.UI;
public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
       UI.printBoard(chessMatch.getPieces());

    }


}
