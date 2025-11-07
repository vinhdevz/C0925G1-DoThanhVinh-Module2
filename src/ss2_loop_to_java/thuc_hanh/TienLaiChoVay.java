package ss2_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        double tiengui = 1.0;
        int thang = 1;
        double laisuat = 1.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        tiengui = scanner.nextDouble();

        System.out.println("Nhập số tháng gửi: ");
        thang = scanner.nextInt();

        System.out.println("Nhập lãi suất: ");
        laisuat = scanner.nextDouble();

        double laisuatnhanduoc = 0;
        for (int i = 0; i < thang; i++) {
            laisuatnhanduoc += tiengui * (laisuat/100)/12 * thang;
        }
        System.out.println("Lãi suất phải trả là: " + laisuatnhanduoc);
    }
}
