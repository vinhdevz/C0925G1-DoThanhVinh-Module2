package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải quyết phương trình");
        System.out.println("Cho phương trình như sau 'a * x + b = c', vui lòng nhập hằng số: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Chuyển phương trình với x = %f!\n" + answer);
        } else {
            if (b == c) {
                System.out.println("Tất cả là x!");
            } else {
                System.out.println("Không có cách");
            }
        }
    }
}
