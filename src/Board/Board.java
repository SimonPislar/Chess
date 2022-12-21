package Board;

import Pieces.*;
import Position.*;

import java.awt.*;

public class Board {
    Square[][] board;

    public Board() {
        this.board = makeBoard();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Square[] row : this.board) {
            for(Square square : row) {
                if (square.isOccupied()) {
                    stringBuilder.append(square.getPiece().toString());
                } else {
                    stringBuilder.append(square.toString());
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    private Square[][] makeBoard() {
        Square[][] board = new Square[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                board[i][j] = new Square(makePosition(i + 1, j + 1));
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
        prepareWhiteSide();
        prepareBlackSide();
    }

    private void prepareBlackSide() {
        for (Square square : this.board[6]) {
            square.setPiece(new Pawn(Color.BLACK, square.getPosition()));
        }
        int index = 0;
        for (Square square : this.board[7]) {
            switch (index) {
                case 0, 7 -> square.setPiece(new Rook(Color.BLACK, square.getPosition()));
                case 1, 6 -> square.setPiece(new Knight(Color.BLACK, square.getPosition()));
                case 2, 5 -> square.setPiece(new Bishop(Color.BLACK, square.getPosition()));
                case 3 -> square.setPiece(new King(Color.BLACK, square.getPosition()));
                case 4 -> square.setPiece(new Queen(Color.BLACK, square.getPosition()));
                default -> throw new RuntimeException("Index of board has to be 0-7");
            }
            index++;
        }
    }

    private void prepareWhiteSide() {
        for (Square square : this.board[1]) {
            square.setPiece(new Pawn(Color.WHITE, square.getPosition()));
        }
        int index = 0;
        for (Square square : this.board[0]) {
            switch (index) {
                case 0, 7 -> square.setPiece(new Rook(Color.WHITE, square.getPosition()));
                case 1, 6 -> square.setPiece(new Knight(Color.WHITE, square.getPosition()));
                case 2, 5 -> square.setPiece(new Bishop(Color.WHITE, square.getPosition()));
                case 3 -> square.setPiece(new King(Color.WHITE, square.getPosition()));
                case 4 -> square.setPiece(new Queen(Color.WHITE, square.getPosition()));
                default -> throw new RuntimeException("Index of board has to be 0-7");
            }
            index++;
        }
    }
}
