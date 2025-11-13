package ss7_abstract_interface_to_java.thuc_hanh.th3;

import ss6_inheritance_to_java.thuc_hanh.cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.4);
        circles[1] = new Circle();
        circles[2] = new Circle("red",true,3.2);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circlecomparator = new CircleComparator();
        Arrays.sort(circles, circlecomparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
