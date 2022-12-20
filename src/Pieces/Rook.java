package Pieces;

import Position.Position;

import java.awt.*;

public class Rook extends Piece {
    private boolean hasMoved;
    public Rook(Color color, Position position) {
        super(color, position);
        this.hasMoved = false;
    }

    @Override
    public boolean legalMove() {
        return false;
    }

    public boolean getHasMoved() {
        return this.hasMoved;
    }

    public void hasMoved() {
        this.hasMoved = true;
    }
}
