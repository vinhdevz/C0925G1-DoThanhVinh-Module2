package ss6_inheritance_to_java.thuc_hanh.cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(2.3,"Pink",false);
        System.out.println(square);
    }
}
