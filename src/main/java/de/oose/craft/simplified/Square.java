package de.oose.craft.simplified;


/**
 *
 */
public class Square {

    private int sideLength;

    public Square(final int sideLength) {
        this.sideLength = sideLength;
    }

    public int getWidth() {
        return sideLength;
    }

    public int getHeight() {
        return sideLength;
    }

    public int getArea() { return sideLength * sideLength; }

}
