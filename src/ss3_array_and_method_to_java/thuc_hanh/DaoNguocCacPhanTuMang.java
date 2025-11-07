package ss3_array_and_method_to_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập từng phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mảng ban đầu: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("\nMảng sau khi đào ngược: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
