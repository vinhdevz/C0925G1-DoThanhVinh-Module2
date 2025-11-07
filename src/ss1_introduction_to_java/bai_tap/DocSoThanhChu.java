package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        System.out.println("Nhập số: ");
        int n = scanner.nextInt();

        if (n >= 0 && n <= 10) {
            System.out.println("Cách đọc: " + words[n]);
        } else {
            System.out.println("Số ngoài phạm vi!");
        }
    }
}
