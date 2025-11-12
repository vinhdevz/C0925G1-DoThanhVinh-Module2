package ss5_modifier_to_java.bai_tap;

public class LopChiGhi {

    public static class Student {
        private String name = "John";
        private String classes = "C02";

        public Student() {
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }

        public String getName() {
            return name;
        }

        public String getClasses() {
            return classes;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Vinh");
        s1.setClasses("CO3");
        System.out.println("Tên học sinh: " + s1.getName());
        System.out.println("Lớp học: " + s1.getClasses());
    }

}
