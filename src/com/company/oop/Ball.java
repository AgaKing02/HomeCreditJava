package com.company.oop;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
//By my logic speed==distance
    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        switch (direction) {
            case 1:
                setyDelta(speed);//North
                break;
            case 2:
                setxDelta(speed);//East
                break;
            case 3:
                setyDelta(-speed);//South
                break;
            case 4:
                setxDelta(-speed);//West
                break;
            default:
                break;
        }

    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int raduis) {
        this.radius = raduis;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal() {
        setxDelta(-x);

    }

    public void reflectVertical() {
        setyDelta(-y);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
