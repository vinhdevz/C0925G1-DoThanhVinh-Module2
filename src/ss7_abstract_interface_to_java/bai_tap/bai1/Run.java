package ss7_abstract_interface_to_java.bai_tap.bai1;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Random random = new Random();

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(5.0);
        resizeables[1] = new Rectangle(4, 7);
        resizeables[2] = new Square(5);

        for (Resizeable resizeable : resizeables){
            double percent = 1 + random.nextInt(100);
            System.out.println("Trước khi tăng ");
            printArea(resizeable);

            resizeable.resize(percent);


            System.out.println("Sau khi tăng " + percent + "%:");
            printArea(resizeable);
        }
    }

    private static void printArea(Resizeable resizeable) {
        if(resizeable instanceof Circle){
            System.out.println("Diện tích hình tròn: " + ((Circle) resizeable).getArea());
        } else if (resizeable instanceof Rectangle) {
            System.out.println("Diện tích hình chữ nhật: " + ((Rectangle) resizeable).getArea());
        } else if(resizeable instanceof Square) {
            System.out.println("Diện tích hình vuông: " + ((Square) resizeable).getArea());
        }
    }
}
