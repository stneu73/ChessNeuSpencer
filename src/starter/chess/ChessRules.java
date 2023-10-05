package chess;

/**
 * Contains all the rules of chess (board size, start, movement
 */
public interface ChessRules {
    int getBoardSize();
    ChessBoard getInitialBoardState();
    ChessMove getPieceMoves(ChessPiece pieceType);
    boolean getCheck(ChessBoard currBoard);
    boolean getCheckMate(ChessBoard currBoard);
    ChessPiece getPromotion();
}
