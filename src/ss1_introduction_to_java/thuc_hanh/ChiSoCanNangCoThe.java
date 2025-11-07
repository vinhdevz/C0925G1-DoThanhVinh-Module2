package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Cân nặng của bạn: ");
        weight = scanner.nextDouble();
        System.out.println("Chiều cao của bạn: ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Phân loại của bạn là: ");
        if (bmi < 18.5) {
            System.out.println(bmi + " Bạn đang thiếu cân!");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " Bạn đang bình thường!");
        } else if (bmi < 30.0) {
            System.out.println(bmi + " Bạn đang thừa cân!");
        } else {
            System.out.println(bmi + " Bạn đang béo phì");
        }
    }
}
