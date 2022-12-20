package Pieces;

import Position.Position;

import java.awt.*;

public class Bishop extends Piece {
    public Bishop(Color color, Position position) {
        super(color, position);
    }

    @Override
    public Piece accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public boolean legalMove() {
        return false;
    }
}
