package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        int number = 10;
//        long number1 = 20;
//        double number2 = 12;
//        float number3 = 10f;
//        char c = 'c';
//        boolean z = true;
//        String s = "He";
//        Double d1 = 12.0;
//        final double PI = 3.14;
//
//        int n1 = 10;
//        int n2 = 10;
//        System.out.println(n1==n2);
//
//        String s1 = new String("a");
//        String s2 = new String("a");
//        System.out.println(s1==s2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập điểm:");
        float score = Float.parseFloat(scanner.nextLine());
        System.out.println("Tuổi của bạn là: "+ age);
        System.out.println("Tên của bạn là: "+ name);
        System.out.println("Điểm của bạn là: "+ score);


        int month = 5;
        switch (month) {
            case 1:
                System.out.println("Tháng 1");
                break;
            case 2:
                System.out.println("Tháng 2");
                break;
            default:
                System.out.println("Không phải tháng trong năm");
        }
    }
}
