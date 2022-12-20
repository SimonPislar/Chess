package Pieces;

import Position.Position;

import java.awt.Color;

public abstract class Piece {

    final private Color color;
    private Position position;

    public Piece(Color color, Position position) {
        this.color = color;
        this.position = position;
        if (!(color.equals(Color.black)) && !(color.equals(Color.white))) {
            throw new IllegalArgumentException("Piece has be black or white");
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract boolean legalMove();
}
