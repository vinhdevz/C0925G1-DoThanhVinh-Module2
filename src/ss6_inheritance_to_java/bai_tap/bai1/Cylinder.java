package ss6_inheritance_to_java.bai_tap.bai1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius) {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() + getRadius() + getHeight();
    }

    public String toString() {
        return super.toString() + " Thể tích: " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 4,"đỏ");
        System.out.println(cylinder);
    }
}
