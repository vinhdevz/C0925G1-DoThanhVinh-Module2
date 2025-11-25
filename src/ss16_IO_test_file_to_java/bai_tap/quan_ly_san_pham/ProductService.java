package ss16_IO_test_file_to_java.bai_tap.quan_ly_san_pham;

import java.util.List;
import java.util.Scanner;

public class ProductService {
    private ProductRepository repo = new ProductRepository();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập hãng sản xuất: ");
        String producer = scanner.nextLine();

        System.out.println("Nhập mô tả: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, producer, description);

        List<Product> list = repo.readFromFile();
        list.add(product);
        repo.writeToFile(list);
        System.out.println("Thêm sản phẩm thành công!");
    }

    public void displayProducts() {
        List<Product> list = repo.readFromFile();

        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        list.forEach(System.out::println);
    }

    public void searchProduct() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = scanner.nextLine();

        List<Product> list = repo.readFromFile();

        for (Product p : list) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Tìm thấy sản phẩm:");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm!");
    }

}
