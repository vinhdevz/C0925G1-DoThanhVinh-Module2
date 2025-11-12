package ss5_modifier_to_java.bai_tap;

public class AccessModifier {

    public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);

        System.out.println("Bán kính c1: " + c1.getRadius());
        System.out.println("Diện tích c1: " + c1.getArea());

        System.out.println("Bán kính c2: " + c2.getRadius());
        System.out.println("Diện tích c2: " + c2.getArea());
    }
}
