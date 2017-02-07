package ru.Babin.Sand_Box;

/**
 * Created by user on 21.01.2017.
 */
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double mDistance(Point p2){

        double x2=p2.getX();
        double y2=p2.getY();

        return Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
    }
}
