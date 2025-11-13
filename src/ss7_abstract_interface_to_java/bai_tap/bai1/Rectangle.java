package ss7_abstract_interface_to_java.bai_tap.bai1;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void resize(double percent) {
        width += height * percent / 100;
        height += width * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and height = " + height;
    }
}
