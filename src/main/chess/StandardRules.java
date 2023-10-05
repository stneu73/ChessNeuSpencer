package chess;

public class StandardRules implements ChessRules {
    @Override
    public int getBoardSize() {
        return 0;
    }

    @Override
    public ChessBoard getInitialBoardState() {
        return null;
    }

    @Override
    public ChessMove getPieceMoves(ChessPiece pieceType) {
        return null;
    }

    @Override
    public boolean getCheck(ChessBoard currBoard) {
        return false;
    }

    @Override
    public boolean getCheckMate(ChessBoard currBoard) {
        return false;
    }

    @Override
    public ChessPiece getPromotion() {
        return null;
    }
}
