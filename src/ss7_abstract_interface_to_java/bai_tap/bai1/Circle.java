package ss7_abstract_interface_to_java.bai_tap.bai1;

public class Circle implements Resizeable{
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public void resize(double percent){
        radius += radius * percent/100;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}
