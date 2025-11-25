package ss19_string_regex_to_java.bai_tap;

public class ClassNameExampleTest {
    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();

        String[] validClass = {"C0233G", "A2322H", "P6666I"};
        String[] invalidClass = {"M0318G", "P0323A"};

        System.out.println("===Tên lớp hợp lệ===");
        for (String className : validClass) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println(className + " : " + isvalid);
        }
        System.out.println("===Tên lớp không hợp lệ===");
        for (String className : invalidClass) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println(className + " : " + isvalid);
        }
    }
}
