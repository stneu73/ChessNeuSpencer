package chess;

import java.util.Collection;

public class Piece implements ChessPiece {
    ChessGame.TeamColor color;
    PieceType type;

    public Piece(ChessGame.TeamColor theColor,PieceType thePiece) {
        color = theColor;
        type = thePiece;
    }
    @Override
    public ChessGame.TeamColor getTeamColor() {
        return color;
    }

    @Override
    public PieceType getPieceType() {
        return type;
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Move[] validMoveSet = Game.getRules().getValidMoves(type, board, myPosition);

        return null;
    }
}
