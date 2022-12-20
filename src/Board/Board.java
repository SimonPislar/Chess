package Board;

import Position.*;

public class Board {
    Square[][] board;

    public Board() {
        this.board = makeBoard();
    }

    private Square[][] makeBoard() {
        Square[][] board = new Square[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = new Square(makePosition(i, j));
            }
        }
        return board;
    }

    private Position makePosition(int row, int column) {
        return new Position(makeColumn(column), new Row(row));
    }

    private Column makeColumn(int index) {
        return switch(index) {
            case 1 -> new Column('A');
            case 2 -> new Column('B');
            case 3 -> new Column('C');
            case 4 -> new Column('D');
            case 5 -> new Column('E');
            case 6 -> new Column('F');
            case 7 -> new Column('G');
            case 8 -> new Column('H');
            default -> throw new IllegalArgumentException("Index has to be 1-8");
        };
    }

    public void prepareBoard() {
        // add pieces to the board in the correct positions
    }

    public static void main(String[] args) {
        Board board = new Board();
    }
}
