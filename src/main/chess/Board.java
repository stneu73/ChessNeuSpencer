package chess;

public class Board implements ChessBoard {
    ChessPiece[][] piecesOnBoard;
    ChessRules rules = null;
    public Board() {};
    public Board(ChessRules rules) {
        this.rules = rules;
    }
    @Override
    public void addPiece(ChessPosition position, ChessPiece piece) {

    }

    @Override
    public ChessPiece getPiece(ChessPosition position) {
        return null;
    }

    @Override
    public void resetBoard() {
        if (rules != null) {
            piecesOnBoard = rules.getInitialBoardState();
        }
        else {
            //hardcode initial board state
        }
    }
}
