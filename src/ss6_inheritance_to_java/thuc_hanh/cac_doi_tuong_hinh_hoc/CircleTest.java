package ss6_inheritance_to_java.thuc_hanh.cac_doi_tuong_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("yellow", false, 3.5);
        System.out.println(circle);
    }
}
