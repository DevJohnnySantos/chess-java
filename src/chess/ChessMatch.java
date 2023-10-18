package chess;

import boardergame.Board;
import boardergame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialStup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matt = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matt[i][j] = (ChessPiece) board.piece(i, j);

            }
        }
        return matt;
    }
    private  void initialStup(){
        board.placePiece(new Rook(board, Color.White), new Position(2,1));
        board.placePiece(new King(board, Color.Black), new Position(0,4));
        board.placePiece(new King(board, Color.White), new Position( 7,4));
    }
}

