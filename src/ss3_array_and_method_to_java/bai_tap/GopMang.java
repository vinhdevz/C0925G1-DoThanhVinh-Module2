package ss3_array_and_method_to_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = 3;
        int size2 = 4;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Nhập các phần tử cho mảng 1: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Nhập các phần tử cho mảng 2: ");
        for (int i = 0; i < size2; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }

        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
