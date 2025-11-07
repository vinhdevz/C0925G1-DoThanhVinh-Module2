package ss3_array_and_method_to_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int SIZE = scanner.nextInt();
        int[] numbers = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
            numbers[i] = scanner.nextInt();

            int min = numbers[0];

            for (int j = 0; j < SIZE; j++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        }
    }
}
