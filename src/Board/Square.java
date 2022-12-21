package Board;

import Pieces.Piece;
import Position.Position;

public class Square {

    private boolean occupied;
    private Piece piece;
    private final Position position;

    public Square(Position position) {
        this.position = position;
        this.occupied = false;
        this.piece = null;
    }

    public String toString() {
        return this.position.toString();
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        this.occupied = true;
    }

    public void removePiece() {
        this.piece = null;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public Piece getPiece() {
        return this.piece;
    }
}
