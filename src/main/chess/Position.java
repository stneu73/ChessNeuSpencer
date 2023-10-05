package chess;

public class Position implements ChessPosition {
    private int row;
    private int column;
    public Position(int rowIndex, int columnIndex) {
        row = rowIndex;
        column = columnIndex;
    }
    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
