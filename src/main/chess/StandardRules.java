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

    public ChessMove[] getValidMoves(ChessPiece.PieceType pieceType, ChessBoard currBoard, ChessPosition currPos) {
        return new ChessMove[0];
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
