package ss3_array_and_method_to_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [][] arr = {
                {1.2, 2.3, 3.4},
                {3.4, 2.5, 4.5}
        };

        System.out.println("Mảng hiện tại: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.print("Nhập chỉ số cột muốn tính tổng: ");
        int col = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        System.out.println("Tổng các phần tử ở cột " + col + "là: " + sum);
    }
}
