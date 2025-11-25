package ss16_IO_test_file_to_java.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private final String FILE_PATH = "product.dat";

    public void writeToFile(List<Product> products) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {

            oos.writeObject(products);
            System.out.println("Đã lưu dữ liệu vào file.");

        } catch (Exception e) {
            System.out.println("Lỗi ghi file!");
            e.printStackTrace();
        }
    }

    public List<Product> readFromFile() {
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_PATH))) {

            return (List<Product>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file!");
            return new ArrayList<>();
        }
    }
}
