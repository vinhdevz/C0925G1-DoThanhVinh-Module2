package ss6_inheritance_to_java.bai_tap.bai2;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
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

    public float[] getXY() {
        return new float[]{getX(), getY()};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return " " + getX() + " " + getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(4,5);
        System.out.println(point2D);
    }

}
