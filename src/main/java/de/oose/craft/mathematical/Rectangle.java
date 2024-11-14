package de.oose.craft.mathematical;

import org.w3c.dom.css.Rect;

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
