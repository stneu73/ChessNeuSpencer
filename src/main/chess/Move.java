package chess;

public class Move implements ChessMove {
    ChessPosition startPos;
    ChessPosition endPos;

    public Move(ChessPosition givenStart, ChessPosition givenEnd) {
        startPos = givenStart;
        endPos = givenEnd;
    }
    @Override
    public ChessPosition getStartPosition() {
        return startPos;
    }

    @Override
    public ChessPosition getEndPosition() {
        return endPos;
    }

    @Override
    public ChessPiece.PieceType getPromotionPiece() {
        return null;
    }
}
