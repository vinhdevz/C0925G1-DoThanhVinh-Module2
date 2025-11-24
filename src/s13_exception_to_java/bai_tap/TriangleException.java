package s13_exception_to_java.bai_tap;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập cạnh a:");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.println("Nhập cạnh b:");
            double b = Double.parseDouble(scanner.nextLine());

            System.out.println("Nhập cạnh c:");
            double c = Double.parseDouble(scanner.nextLine());

            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Tạo tam giác thành công");

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập số");
        } catch (ITriangleException e) {
            System.out.println("Lỗi tam giác: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}
