package Pieces;

import Position.Position;

import java.awt.*;

public class Bishop extends Piece {
    public Bishop(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean legalMove() {
        return false;
    }
}
