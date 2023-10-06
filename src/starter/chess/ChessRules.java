package chess;

/**
 * Contains all the rules of chess (board size, start, movement
 */
public interface ChessRules {
    int getBoardSize();
    ChessBoard getInitialBoardState();
    ChessMove[] getValidMoves(ChessPiece.PieceType pieceType, ChessBoard currBoard, ChessPosition currPos);

    boolean getCheck(ChessBoard currBoard);
    boolean getCheckMate(ChessBoard currBoard);
    ChessPiece getPromotion();
}
