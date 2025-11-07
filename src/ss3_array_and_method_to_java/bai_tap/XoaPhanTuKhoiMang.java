package ss3_array_and_method_to_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 3, 5, 7, 8, 9, 12};
        int n = numbers.length;

        System.out.print("Nhập phần tử cần xóa: ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            n--;

            System.out.println("Mảng sau khi xóa phần tử " + X + " là: ");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else {
            System.out.println("Không tìm thấy phần tử " + X + " trong mảng.");
        }

        scanner.close();
    }
}
