package inheritance.point_moveablepoint;

public class MoveablePoint extends  Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint() {

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[2];
    }

    @Override
    public String toString() {
        return " x= " + super.getX()
                + " y= " + super.getY()
                + " MovablePoint" +
                " xSpeed=" + getxSpeed()
                + " ySpeed=" + getySpeed()
                ;
    }
    public MoveablePoint move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(2.5f,9.0f);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(1.5f,2.5f,4.6f,9.9f);
        System.out.println(moveablePoint);
    }
}
