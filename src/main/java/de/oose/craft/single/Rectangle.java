package de.oose.craft.single;

/**
 * Rectangle with a single responsibility:
 *
 * - Dimension (width and height)
 *
 *
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

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
}
