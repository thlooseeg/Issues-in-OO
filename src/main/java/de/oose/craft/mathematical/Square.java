package de.oose.craft.mathematical;


/**
 *
 */
public class Square extends Rectangle {

    public Square() {
    }

    public Square(final int sideLength) {
        super(sideLength,sideLength);
    }

    public void setWidth(final int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(final int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

}
