package ss8_clean_code_refactoring_to_java.CRUD_MVC.entity;

public class Student extends Person {
    private String className;
    private static String school;

    static {
        school = "CODEGYM";
    }

    public Student() {
    }

    public Student(int id, String name, String address) {
        super(id, name, address);
    }

    public Student(int id, String name, String address, String className, String school) {
        super(id, name, address);
        this.className = className;
        this.school = school;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object object) {
        Student student = (Student) object;
        return this.getId() == student.getId();
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", className = '" + this.getClassName() +
                '}';
    }
}
