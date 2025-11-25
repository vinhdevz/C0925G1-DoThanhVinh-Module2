package ss16_IO_test_file_to_java.bai_tap.quan_ly_san_pham;


import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductService();

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> service.addProduct();
                case 2 -> service.displayProducts();
                case 3 -> service.searchProduct();
                case 4 -> {
                    System.out.println("Tạm biệt!");
                    return;
                }
                default -> System.out.println("Sai lựa chọn!");
            }
        }
    }
}
