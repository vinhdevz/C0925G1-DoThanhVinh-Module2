package ss5_modifier_to_java.thuc_hanh;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Vinh");
        Student s2 = new Student(222, "Long");
        Student s3 = new Student(333, "Hải");

        s1.display();
        s2.display();
        s3.display();
    }
}
