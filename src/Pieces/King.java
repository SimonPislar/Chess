package Pieces;

import Position.Position;

import java.awt.Color;

public class King extends Piece{

    private boolean hasMoved;

    public King(Color color, Position position) {
        super(color, position);
        this.hasMoved = false;
    }

    @Override
    public String toString() {
        return "King";
    }

    @Override
    public Piece accept(Visitor v) {
        return v.visit(this);
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
