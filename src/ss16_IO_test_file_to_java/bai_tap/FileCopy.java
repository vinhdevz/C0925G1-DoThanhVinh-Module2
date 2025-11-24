package ss16_IO_test_file_to_java.bai_tap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập nguồn dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.println("Nhập nguồn dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại! Không thể ghi đè");
            return;
        }

        int count = 0;

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile);
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
                count++;
            }
            System.out.println("Sao chép thành công");
            System.out.println("Số ký tự đã sao chép: " + count);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file");
            e.printStackTrace();
        }
    }
}
