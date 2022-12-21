package Pieces;

import Position.Position;

import java.awt.*;

public class Knight extends Piece{
    public Knight(Color color, Position position) {
        super(color, position);
    }

    @Override
    public String toString() {
        return "Knight";
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
