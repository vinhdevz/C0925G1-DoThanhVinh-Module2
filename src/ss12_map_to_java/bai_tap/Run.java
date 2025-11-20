package ss12_map_to_java.bai_tap;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====QUẢN LÝ SẢN PHẦM=====");
            System.out.println("1.Thêm mới");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Hiển thị danh sách");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6.Sắp xếp sản phầm tăng dần");
            System.out.println("7.Sắp xếp sản phầm giảm dần");
            System.out.println("0.Thoát");
            System.out.println("Chọn chức năng:");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    productManager.addProduct(new Product(id, name, price));
                }
                case 2 -> {
                    System.out.println("Nhập id cần sửa: ");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.println("Giá mới: ");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    if (productManager.editProduct(idEdit, newName, newPrice))
                        System.out.println("Sửa thành công!");
                    else
                        System.out.println("Không tìm thấy sản phầm!");
                }
                case 3 -> {
                    System.out.println("Nhập id cần xóa: ");
                    int idRemove = Integer.parseInt(scanner.nextLine());
                    if (productManager.removeProduct(idRemove))
                        System.out.println("Xóa thành công!");
                    else
                        System.out.println("Không tìm thấy sản phẩm!");
                }
                case 4 -> {
                    productManager.showProduct();
                }
                case 5 -> {
                    System.out.println("Nhập id cần tìm: ");
                    productManager.searchProduct(scanner.nextLine());
                }
                case 6 -> {
                    productManager.sortByAscending();
                    System.out.println("Đã sắp xếp tăng dần!");
                }
                case 7 -> {
                    productManager.sortByDescending();
                    System.out.println("Đã sắp xếp giảm dần!");
                }
                case 0 -> {
                    System.out.println("Thoát chương trình!");
                    return;
                }
                default -> System.out.println("Sai lựa chọn! Vui lòng nhập lại.");
            }
        }
    }
}
