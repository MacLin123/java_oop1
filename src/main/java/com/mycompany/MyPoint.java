package com.mycompany;

/**
 * This class provides methods to work with points
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        double result = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return result;
    }

    public double distance(MyPoint another) {
        int x = another.getX();
        int y = another.getY();
        return distance(x, y);
    }

    public double distance() {
        return distance(0, 0);
    }
}
