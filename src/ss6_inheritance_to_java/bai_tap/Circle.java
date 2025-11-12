package ss6_inheritance_to_java.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public String toString() {
        return "Bán kính = " + getRadius() + " Màu: " + getColor() + " Diện tích: " + getArea();
    }

    public static void main(String[] args) {
        Circle circleAndCylinder = new Circle(10, "red");
        System.out.println(circleAndCylinder);
    }
}
