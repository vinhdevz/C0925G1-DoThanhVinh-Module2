package ss3_array_and_method_to_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Vinh", "Long", "Hải"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        String inputName = scanner.nextLine();

        boolean isExits = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(inputName)) {
                System.out.println("Vị trí học sinh trong danh sách " + inputName + " là: " + i);
                isExits = true;
                break;
            }
        }
    if (!isExits){
        System.out.println("Không tìm thấy " + inputName + " trong danh sách.");
    }
    }
}
