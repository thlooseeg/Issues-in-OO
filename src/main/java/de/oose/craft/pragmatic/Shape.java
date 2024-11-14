package de.oose.craft.pragmatic;

public abstract class Shape {

    public abstract int getWidth();
    public abstract int getHeight();

    public int getArea() {
        return getWidth() * getWidth();
    }
}
