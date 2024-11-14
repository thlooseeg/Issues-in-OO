package de.oose.craft.constructorproblem;

/**
 *  LocatedRectangle
 *
 *  Responsibilities:
 *    - Dimension (width and height)
 *
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    /**
    public Rectangle(final int width) {
        this.width = width;
    }
     */

    /**
     *
     * @param height
    public Rectangle(final int height) {
        this.height = height;
    }
     */


    /** constructor problem
     *
     * @param width
     * @param height
     */
    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(final int width) { this.width = width; }
    public int getWidth() { return width; }
    public void setHeight(final int height) { this.height = height; }
    public int getHeight() { return height; }

    public static RectangleBuilder builder() {
        return new RectangleBuilder();
    }

    /**
     * <h1>Solving the constructor problem</h1>
     * <p>
     * This implementation for a rectangle does not conform to SOLID.
     * </p>
     * <p>
     *      Two constructors, one accepting the location (x,y) and
     *      the other constructor accepting the dimension (width, height)
     *      is not allowed. Java will only look at the type of the parameter
     *      and for both constructors, there are two int parameters.
     * </p>
     * <p>
     *     The builder pattern provides a solution to this problem.
     * </p>
     *
     */
    public static class RectangleBuilder {

        private int width;
        private int height;

        public RectangleBuilder setWidth(final int width) {
            this.width = width;
            return this;
        }
        public RectangleBuilder setHeight(final int height) {
            this.height = height;
            return this;
        }
        public Rectangle build() {
            Rectangle locatedRectangle = new Rectangle();


            locatedRectangle.setWidth(width);
            locatedRectangle.setHeight(height);

            return locatedRectangle;
        }
    }
}
