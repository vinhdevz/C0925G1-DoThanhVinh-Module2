package ss6_inheritance_to_java.bai_tap.bai2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

    public String toString() {
        return super.toString() + " " + getZ();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,5,6);
        System.out.println(point3D);
    }
}
