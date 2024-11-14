package de.oose.craft.multiples;

/**
 *  LocatedRectangle
 *
 *  Responsibilities:
 *    - Location (x and y)
 *    - Dimension (width and height)
 *
 */
public class LocatedRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public LocatedRectangle() {
    }

    public LocatedRectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    /** constructor problem
    public LocatedRectangle(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
     */

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setX(final int x) { this.x = x; }
    public int getX() { return x; }
    public void setY(final int y) { this.y = y; }
    public int getY() { return y; }
}
