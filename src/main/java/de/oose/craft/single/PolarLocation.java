package de.oose.craft.single;

public class PolarLocation extends Location {
    private double radius;
    private double theta;

    public PolarLocation(double radius, double theta) {
        this.radius = radius;
        this.theta = theta;
    }

    public double getRadius() {
        return radius;
    }
    public double getTheta() {
        return theta;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setTheta(double theta) {
        this.theta = theta;
    }

    public int getX() {
        Double d = radius * Math.cos(theta);
        return  d.intValue();
    }

    public int getY() {
        Double d = radius * Math.sin(theta);
        return d.intValue();
    }
}
