package ss3_array_and_method_to_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max);
    }
}
