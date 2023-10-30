package chess;

import boardergame.BordereException;

public class ChessException extends BordereException {
    private static final long serialVersionUID =1L;
    public ChessException(String msg){
        super(msg);
    }
}
