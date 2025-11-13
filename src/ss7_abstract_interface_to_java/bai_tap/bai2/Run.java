package ss7_abstract_interface_to_java.bai_tap.bai2;

public class Run {
    public static void main(String[] args) {
        Object[] objects = new Object[1];
        objects[0] = new Square(6);

        for (Object object : objects) {
            if(object instanceof Square){
                System.out.println(object);
                System.out.println("Diện tích hình vuông: " + ((Square) object).getArea());
            }

            if(object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}
