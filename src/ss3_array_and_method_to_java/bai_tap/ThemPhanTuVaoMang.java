package ss3_array_and_method_to_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 3, 5, 6, 7, 8, 9};
        int n = numbers.length;

        System.out.print("Nhập phần tử cần thêm: ");
        int X = scanner.nextInt();

        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();

        if (index < 0 || index > n) {
            System.out.println("Không được chèn phần tử vào mảng!");
        } else {
            int[] newArr = new int[n + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = numbers[i];
            }

            newArr[index] = X;
            for (int i = index; i < n; i++) {
                newArr[i + 1] = numbers[i];
            }

            System.out.println("Mảng sau khi chèn phần tử " + X + " là: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }
}
