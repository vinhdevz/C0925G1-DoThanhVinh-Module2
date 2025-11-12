package ss6_inheritance_to_java.thuc_hanh.cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public String toString() {
        return "A Rectangle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
