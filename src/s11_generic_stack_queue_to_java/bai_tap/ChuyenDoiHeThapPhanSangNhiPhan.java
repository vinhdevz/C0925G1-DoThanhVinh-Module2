package s11_generic_stack_queue_to_java.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thập phân: ");
        int decimal = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        int numbers = decimal;

        while (numbers > 0) {
            int remainder = numbers % 2;
            stack.push(remainder);
            numbers = numbers / 2;
        }

        System.out.print(decimal + " Decimal = ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.print(" Binary");
    }
}
