package chess;

import java.util.Collection;

public class Piece implements ChessPiece {
    ChessGame.TeamColor color;
    PieceType type;
    ChessRules rules;

    public Piece(ChessGame.TeamColor color,PieceType type) {
        this.color = color;
        this.type = type;
        this.rules = rules;
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
//        ChessMove[] validMoveSet =
        return rules.getValidMoves(type, board, myPosition);
    }
}
