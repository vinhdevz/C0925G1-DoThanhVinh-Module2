package ss3_array_and_method_to_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "DO THANH VINH";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Ký tự " + kyTu + " xuất hiện " + count + " lần trong chuỗi " + str + ".");
    }
}
