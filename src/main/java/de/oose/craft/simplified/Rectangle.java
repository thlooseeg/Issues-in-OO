package de.oose.craft.simplified;

/**
 *
 * We already have a square with a side length. Let's save some code and reuse the square for the rectangle.
 * We only need to extend the square with a field for width.
 *
 */
public class Rectangle extends Square {
    private int width;

    public Rectangle(final int width, final int height) {
        super(height);
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getArea() {
        return width * super.getHeight();
    }

}
