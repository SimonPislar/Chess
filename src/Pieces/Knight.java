package Pieces;

import Position.Position;

import java.awt.*;

public class Knight extends Piece{
    public Knight(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean legalMove() {
        return false;
    }
}
