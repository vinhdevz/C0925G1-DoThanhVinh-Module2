package ss5_modifier_to_java.CRUD;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        StudentService studentService = StudentService.getInstance();
        final int DISPLAY = 1;
        final int ADD = 2;
        final int UPDATE = 3;
        final int DELETE = 4;

        Scanner scanner = new Scanner(System.in);
        boolean isNotExit = true;

        while (isNotExit) {
            System.out.println("-----QUẢN LÝ SINH VIÊN-----" +
                    "\n1. Danh sách sinh viên" +
                    "\n2. Thêm sinh viên" +
                    "\n3. Cập nhật sinh viên" +
                    "\n4. Xóa sinh viên" +
                    "\n5. Thoát chương trình"
            );
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case DISPLAY:
                    System.out.println("\n--- Danh sách sinh viên ---");
                    Student[] studentsList = studentService.getAll();
                    for (int i = 0; i < studentsList.length; i++) {
                        if (studentsList[i] != null) {
                            System.out.println((i + 1) + ". " + studentsList[i]);
                        } else {
                            break;
                        }
                    }
                    break;

                case ADD:
                    System.out.println("\n--- Thêm mới sinh viên ---");
                    System.out.print("Nhập ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    Student student = new Student(id, name, address);
                    studentService.add(student);
                    break;

                case UPDATE:
                    System.out.println("\n--- Cập nhật sinh viên ---");
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập địa chỉ mới: ");
                    String newAddress = scanner.nextLine();
                    studentService.update(updateId, newName, newAddress);
                    break;

                case DELETE:
                    System.out.println("\n--- Xóa sinh viên ---");
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    studentService.delete(deleteId);
                    break;

                default:
                    System.out.println("Kết thúc chương trình!");
                    isNotExit = false;
            }
        }
    }
}
