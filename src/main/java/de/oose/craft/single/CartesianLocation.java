package de.oose.craft.single;

/**
 * Cartesian Location
 *
 *
 */
public class CartesianLocation {
    private int x;
    private int y;

    public CartesianLocation() {
    }

    public CartesianLocation(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(final int x) { this.x = x; }
    public int getX() { return x; }
    public void setY(final int y) { this.y = y; }
    public int getY() { return y; }

    public double getRadius() { return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); }
    public double getTheta() { return Math.atan2(y, x); }
}
