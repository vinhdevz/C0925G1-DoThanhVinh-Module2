package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Là năm nhuận " + year);
                } else {
                    System.out.println("Không phải năm nhuận " + year);
                }
            } else {
                System.out.println("Là năm nhuận " + year);
            }
        } else {
            System.out.println("Không phải là năm nhuận " + year);
        }
    }
}
