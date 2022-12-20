package Pieces;

import Position.Position;

import java.awt.*;

public class Pawn extends Piece {
    public Pawn(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean legalMove() {
        return false;
    }
}
