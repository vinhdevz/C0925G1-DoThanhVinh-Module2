package ss7_abstract_interface_to_java.thuc_hanh.th2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.2,"red",true);
        comparableCircles[1] = new ComparableCircle(3.2);
        comparableCircles[2] = new ComparableCircle();

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }
    }
}
