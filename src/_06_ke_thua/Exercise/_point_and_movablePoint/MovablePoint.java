package _06_ke_thua.Exercise._point_and_movablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {}

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float arraySpeed[] = {xSpeed,ySpeed};
        return arraySpeed;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY()) + ",speed = " + Arrays.toString(getSpeed());
    }
    public MovablePoint move() {
        float x2 = getX();
        x2 += xSpeed;
        setX(x2);
        float y2 = getY();
        y2 += ySpeed;
        setY(y2);
        return this;
    }
}
