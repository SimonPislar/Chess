package Pieces;

import Position.Position;

import java.awt.*;

public class Queen extends Piece{
    public Queen(Color color, Position position) {
        super(color, position);
    }

    @Override
    public boolean legalMove() {
        return false;
    }
}
