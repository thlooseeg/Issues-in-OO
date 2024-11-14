package de.oose.craft.pragmatic;


/**
 *
 */
public class Square extends Shape {

    private int sideLength;

    public Square() {
    }

    public Square(final int sideLength)
    {
        this.sideLength = sideLength;
    }

    public void setWidth(final int width) {
        this.sideLength = width;
    }

    public void setHeight(final int height) {
        this.sideLength = height;
    }

    @Override
    public int getWidth() {
        return sideLength;
    }

    @Override
    public int getHeight() {
        return sideLength;
    }
}
