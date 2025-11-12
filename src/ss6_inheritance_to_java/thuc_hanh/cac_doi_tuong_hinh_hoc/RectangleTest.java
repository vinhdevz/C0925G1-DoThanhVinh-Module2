package ss6_inheritance_to_java.thuc_hanh.cac_doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle =  new Rectangle(1.2,3.2);
        System.out.println(rectangle);

        rectangle = new Rectangle(3.4,4.2, "red", true);
        System.out.println(rectangle);
    }
}
