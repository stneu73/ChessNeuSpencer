package chess;

import java.util.Collection;

public class StandardRules implements ChessRules {
    @Override
    public int getBoardSize() {
        return 0;
    }

    @Override
    public ChessPiece[][] getInitialBoardState() {
        return null;
    }

    public Collection<ChessMove> getValidMoves(ChessPiece.PieceType pieceType, ChessBoard currBoard, ChessPosition currPos) {
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
