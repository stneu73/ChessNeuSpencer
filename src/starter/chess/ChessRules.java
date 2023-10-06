package chess;

import java.util.Collection;

/**
 * Contains all the rules of chess (board size, start, movement
 */
public interface ChessRules {
    int getBoardSize();
    ChessPiece[][] getInitialBoardState();
    Collection<ChessMove> getValidMoves(ChessPiece.PieceType pieceType, ChessBoard currBoard, ChessPosition currPos);

    boolean getCheck(ChessBoard currBoard);
    boolean getCheckMate(ChessBoard currBoard);
    ChessPiece getPromotion();
}
