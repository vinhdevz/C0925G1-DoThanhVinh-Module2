package ss5_modifier_to_java.CRUD;

public class StudentService {
    private Student[] studentsList = new Student[100];
    private int size = 0;

    private static final StudentService instance = new StudentService();

    {
        add(new Student(1, "Đỗ Thành Vinh", "Hà Nội"));
        add(new Student(2, "Đinh Nguyên Khả", "Đà Nẵng"));
        add(new Student(3, "Trần Bảo Trâm", "TP. Hồ Chí Minh"));
    }

    private StudentService() {
    }

    public static StudentService getInstance() {
        return instance;
    }

    public Student[] getAll() {
        return studentsList;
    }

    public void add(Student student) {
        studentsList[size] = student;
        size++;
        System.out.println("Đã thêm sinh viên thành công!");
    }

    public void delete(int id) {
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên có id: " + id);
            return;
        }
        for (int i = index; i < size - 1; i++) {
            studentsList[i] = studentsList[i + 1];
        }
        studentsList[size - 1] = null;
        size--;
        System.out.println("Đã xóa sinh viên thành công!");
    }

    public void update(int id, String newName, String newAddress) {
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên có id: " + id);
            return;
        }
        studentsList[index].setName(newName);
        studentsList[index].setAddress(newAddress);
        System.out.println("Đã cập nhật sinh viên thành công!");
    }

    private int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (studentsList[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
